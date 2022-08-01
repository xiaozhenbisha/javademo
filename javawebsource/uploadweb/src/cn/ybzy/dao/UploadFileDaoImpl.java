package cn.ybzy.dao;

import java.util.List;

import cn.ybzy.model.UploadFile;

public class UploadFileDaoImpl extends BaseDao<UploadFile> implements UploadFileDao{

	@Override
	public void addFileInfo(UploadFile uploadFile) {
		String sql = "INSERT INTO `uplaodfiles`(`old_file_name`,`file_type`,`file_szie`,`save_path`,"
				+ "`save_time`,`desc`,`save_name`)values(?,?,?,?,?,?,?)";
		System.out.println(sql);
		super.update(sql, uploadFile.getOldFileName(),uploadFile.getFileType(),
				uploadFile.getFileSize(),uploadFile.getSavePath(),uploadFile.getSaveTime(),uploadFile.getDesc()
				,uploadFile.getSaveName());
	}

	@Override
	public List<UploadFile> getUploadFiles() {
		String sql = "SELECT `id` id,`old_file_name` oldFileName,`file_type` fileType,`file_szie` fileSize,`save_path` savePath,`save_time` saveTime,`desc` `desc`,`save_name` saveName FROM `uplaodfiles`";
		return super.getList(sql);
	}

	@Override
	public void deletUploadFile(int id) {
		String sql = "delete from uplaodfiles where id=? ";
		super.update(sql,id);
	}

	@Override
	public UploadFile get(int id) {
		String sql = "SELECT `id` id,`old_file_name` oldFileName,`file_type` fileType,`file_szie` fileSize,`save_path` savePath,`save_time` saveTime,`desc` `desc`,`save_name` saveName FROM `uplaodfiles` WHERE id=?";
		return super.get(sql, id);
	}

}
