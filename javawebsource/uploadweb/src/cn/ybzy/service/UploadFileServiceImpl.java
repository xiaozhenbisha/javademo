package cn.ybzy.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import cn.ybzy.dao.DaoFactory;
import cn.ybzy.dao.UploadFileDao;
import cn.ybzy.model.UploadFile;
import cn.ybzy.utils.UploadFilePropertiesUtil;

public class UploadFileServiceImpl implements UploadFileService {

	UploadFileDao uploadFileDao = DaoFactory.getUploadFileDao();

	private String saveDir = UploadFilePropertiesUtil.getInstance().getProperty("savePath");
	private String tempDir = UploadFilePropertiesUtil.getInstance().getProperty("tempPath");
	private String sizeThreshold = UploadFilePropertiesUtil.getInstance().getProperty("sizeThreshold");
	private String sizeMax = UploadFilePropertiesUtil.getInstance().getProperty("sizeMax");
	private String fileSizeMax = UploadFilePropertiesUtil.getInstance().getProperty("fileSizeMax");
	private String fileEx = UploadFilePropertiesUtil.getInstance().getProperty("fileEx");

	@Override
	public void addFileInfo(UploadFile uploadFile) {
		// 把上传上来的文件的信息,保存到数据库之前,我们肯定是要先报文件存到服务器上savePath
		uploadFileDao.addFileInfo(uploadFile);
	}

	@Override
	public List<UploadFile> getUploadFiles() {
		return uploadFileDao.getUploadFiles();
	}

	@Override
	public void deletUploadFile(int id) {
		UploadFile uFile = uploadFileDao.get(id);
		// 先把数据库里信息删除
		uploadFileDao.deletUploadFile(id);
		// 还得把服务器磁盘上的文件删除
		deleteFile(uFile.getSavePath()+"\\" + uFile.getSaveName());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void saveFile(HttpServletRequest req, HttpServletResponse resp) {
		// 先把文件保存下来,到服务器指定的目录
		// ①获取和创建保存文件的最终目录和临时目录
		String savePath = req.getSession().getServletContext().getRealPath(this.saveDir); // 保存文件的服务器上的绝对路径
		String tempPath = req.getSession().getServletContext().getRealPath(this.tempDir); // 临时目录
		File tempFile = new File(tempPath);
		if (!tempFile.exists()) {
			tempFile.mkdirs(); // 如果临时目录不存在的话,我用代码的方式,创建一个新目录
		}

		// ②创建一个DiskFileItemFactory工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(Integer.parseInt(this.sizeThreshold)); // 100KB, 上传的文件,<100KB,放到内存当中, >100KB,放tempPath
		factory.setRepository(tempFile); // 设置上传文件的临时目录

		// ③创建一个文件上传解析器
		ServletFileUpload servletFileUpload = new ServletFileUpload(factory); // 得到了文件的解析器
		servletFileUpload.setFileSizeMax(Integer.parseInt(this.fileSizeMax)); // 限制上传单个文件的大小在20MB以内
		servletFileUpload.setHeaderEncoding("UTF-8"); // 防止上传的中文信息是乱码
		servletFileUpload.setSizeMax(Integer.parseInt(this.sizeMax)); // 限制多个文件同时上传的时候,总大小最大值

		// ④判断提交上来的数据是否是上传表单的数据,是不是Multipart编码方式ServletFileUpload.isMultipartContent(request)
		if (!ServletFileUpload.isMultipartContent(req)) {
			throw new RuntimeException("上传文件的Form的编码方式不正确!");
		}

		// ⑤使用ServletFileUpload解析器解析上传数据，解析结果返回的是一个List<FileItem>集合

		String desc = "";
		String fileName = "";
		String fileType = "";
		long fileSize = 0;
		String fileEx1 = "";
		String saveFileName = "";
		String realSavePath = "";
		OutputStream out = null;
		InputStream in = null;
		try {
			List<FileItem> fileList = servletFileUpload.parseRequest(req);

			if (fileList != null && fileList.size() > 0) {
				
				for (FileItem fileItem : fileList) {
					if (fileItem.isFormField()) {
						// ⑦将普通表单域的键值对显示出来
						desc = fileItem.getString("UTF-8");
						//每一次为desc  赋值 :  代表着一个文件已经上来 , 意味着完成里一次文件的上传操作  
						//在这里把上传上来的文件的信息,写入数据库里
						if(!"".equals(fileName)) {
							UploadFile uf = new UploadFile();
							uf.setDesc(desc);
							uf.setFileSize(fileSize + "");
							uf.setFileType(fileType);
							uf.setOldFileName(fileName);
							uf.setSavePath(realSavePath);
							uf.setSaveName(saveFileName);
							uf.setSaveTime(new Date());
							//addFileInfo
							addFileInfo(uf);
						}
					} else {
						// ⑥判断普通域还是文件域
						fileName = fileItem.getName(); // 拿到文件名字 xxx.doc xxx.txt
						fileType = fileItem.getContentType(); // 拿到文件的类型 image/jpg
						// 注意事项: ie拿到的fileName是带有绝对路径, D:\abc\xxx.doc ; 火狐浏览器拿到的 xxxx.doc
						fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
						fileSize = fileItem.getSize(); // 拿到文件的总大小
						fileEx1 = fileName.substring(fileName.lastIndexOf(".") + 1);
						// ⑧验证后缀的合法性
						if (this.fileEx.indexOf(fileEx1) == -1) {
							throw new RuntimeException("禁止上传该文件类型,文件后缀:" + fileEx1);
						}
						// ⑨将文件流写入保存的目录中(生成新的文件名,避免一个目录中文件太多而生成新的存储目录)
						saveFileName = makeFileName(fileName);
						realSavePath = makePath(saveFileName, savePath);
						// 先创建一个输出流
						out = new FileOutputStream(realSavePath + "\\" + saveFileName);
						in = fileItem.getInputStream();

						// 建立缓存区,做一个搬运文件数据流的勺子
						byte[] buffer = new byte[1024];
						int len = 0;
						while ((len = in.read(buffer)) > 0) {
							out.write(buffer, 0, len);
						}
						in.close();
						out.close();
					}
				}
				
			}
			//删除临时目录下临时文件
			File tempd = new File(tempPath);
			for(File file:tempd.listFiles()) {
				file.delete();
			}
		} catch (FileUploadBase.SizeLimitExceededException e) {
			throw new RuntimeException("上传文件总大小超出了限制:" + Integer.parseInt(this.sizeMax) / (1024 * 1024) + "MB!");
		} catch (FileUploadBase.FileSizeLimitExceededException e) {
			throw new RuntimeException("上传单个文件的大小超出了限制:" + Integer.parseInt(this.fileSizeMax) / (1024 * 1024) + "MB!");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void deleteFile(String savePath) {
		//删除服务器上的上传文件
		System.out.println(savePath);
		File file = new File(savePath);
		if(file.isFile()) {
			file.delete();
		}
	}

	private String makePath(String saveFileName, String savePath) {
		// 拿到文件名字,在内存当中地址, hashCode值
		int hashCode = saveFileName.hashCode();
		int dir1 = hashCode & 0xf; // dir1的值,这个与运算的结果范围 0-15
		int dir2 = (hashCode >> 4) & 0xf; // 得到的结果还是中0-15范围内
		// 用dir1,和dir2构造我的新的存储文件的目录
		String dir = savePath + "\\" + dir1 + "\\" + dir2;
		File file = new File(dir);
		if (!file.exists()) {
			file.mkdirs();
		}
		return dir;
	}

	private String makeFileName(String fileName) {
		return UUID.randomUUID().toString() + "_" + fileName;
	}

	@Override
	public UploadFile getUploadFileById(int id) {
		return uploadFileDao.get(id);
	}

}
