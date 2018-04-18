package com.kingfly.service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.stereotype.Service;

import com.kingfly.IDao.ClearingMapper;
import com.kingfly.IDao.FileLocalChannelMapper;
import com.kingfly.IDao.FileSourceChannelMapper;
import com.kingfly.IDao.MarketFileMapper;
import com.kingfly.IDao.SettleMapper;
import com.kingfly.IDao.TaskMapper;
import com.kingfly.constants.FenkuDomain;
import com.kingfly.domain.Clearing;
import com.kingfly.domain.LocalFile;
import com.kingfly.domain.Settle;
import com.kingfly.domain.SourceFile;
import com.kingfly.domain.Task;
import com.kingfly.service.IPickupFileService;
import com.kingfly.utils.FenkuUtil;

@Service("pickupFileService")
public class IPickupFileServiceImpl implements IPickupFileService {

	@Autowired
	private MarketFileMapper marketFileMapper;
	@Autowired
	private FileLocalChannelMapper fileLocalChannelMapper;
	@Autowired
	private FileSourceChannelMapper fileSourceChannelMapper;
	@Autowired
	private ClearingMapper clearingMapper;
	@Autowired
	private SettleMapper settleMapper;
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void copyFile() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<SourceFile> getSourceFileList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.kingfly.IDao.FileSourceChannelMapper.selectSourceFileList");
	}

	@Override
	public List<SourceFile> getSourceFileListByFileType(String fileType) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.kingfly.IDao.FileSourceChannelMapper.selectSourceFileListByFileType",
				fileType);
	}

	@Override
	public List<LocalFile> getLocalFileList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.kingfly.IDao.FileLocalChannelMapper.selectLocalFileList");
	}

	@Override
	public List<LocalFile> getLocalFileListByFileType(String fileType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initFileList() {
		// TODO Auto-generated method stub
		String currDate = DateFormatUtils.format(Calendar.getInstance(), "yyyyMMdd");
		String shortDate = DateFormatUtils.format(Calendar.getInstance(), "MMdd");
		List<LocalFile> localFileList = getLocalFileList();
		for (int i = 0; i < localFileList.size(); i++) {
			LocalFile lf = localFileList.get(i);
			String path = lf.getPath();
			String fileName = lf.getFileName();
			String hexdate=FenkuUtil.getHexdateString();
			StringBuffer sb=new StringBuffer();
			if(path.indexOf("日期")>=0) {
				path=path.replaceAll("日期", currDate);
			}
			sb.append(path);
			if(fileName.indexOf("YYYYMMDD")>=0) {
				fileName=fileName.replaceAll("YYYYMMDD", currDate);
			}else if(fileName.indexOf("MMDD")>=0) {
				fileName=fileName.replaceAll("MMDD", shortDate);
			}else if(fileName.indexOf("MDD")>=0) {
				fileName=fileName.replaceAll("MDD", hexdate);
			}
			sb.append(fileName);
			Task currentTask=new Task();
			currentTask.setTaskDate(currDate);
			currentTask.setTrueFileName(sb.toString());
			currentTask.setTaskStatus(FenkuDomain.FILE_NOT_COME);
			currentTask.setTaskDesc("FILE_NOT_COME");
			taskMapper.insertSelective(currentTask); 
		}
	}

	@Override
	public List<Clearing> getClearingList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.kingfly.IDao.ClearingMapper.selectAllClearing");
	}

	@Override
	public List<Settle> getSettleList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("com.kingfly.IDao.ClearingMapper.selectAllSettle");
	}

}
