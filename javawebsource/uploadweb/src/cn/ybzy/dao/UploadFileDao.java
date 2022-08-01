package cn.ybzy.dao;

import java.util.List;

import cn.ybzy.model.UploadFile;

public interface UploadFileDao {
	
	//新增
	public void addFileInfo(UploadFile uploadFile);
	
	//获取到所有上传到服务器上的文件的信息列表
	public List<UploadFile> getUploadFiles();
	
	//删除
	public void deletUploadFile(int id);

	public UploadFile get(int id);
	
}
