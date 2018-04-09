package com.kingfly.service;

import java.util.List;

import com.kingfly.domain.Clearing;
import com.kingfly.domain.LocalFile;
import com.kingfly.domain.Settle;
import com.kingfly.domain.SourceFile;

public interface IPickupFileService {
	public void copyFile();
	public List<SourceFile> getSourceFileList();
	public List<SourceFile> getSourceFileListByFileType(String fileType);
	public List<LocalFile> getLocalFileList();
	public List<LocalFile> getLocalFileListByFileType(String fileType);
	public List<Clearing> getClearingList();
	public List<Settle> getSettleList();
	
	//初始化本地待处理文件列表，出事状态为0：未到达
	public void initFileList();
}
