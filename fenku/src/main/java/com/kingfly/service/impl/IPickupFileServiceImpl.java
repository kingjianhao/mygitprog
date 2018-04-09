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
		return sqlSessionTemplate.selectList("com.kingfly.IDao.FileSourceChannelMapper.selectSourceFileListByFileType",fileType);
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
		String currDate=DateFormatUtils.format(Calendar.getInstance(), "yyyyMMdd");
		List<LocalFile> localFileList=getLocalFileList();
		for(int i=0;i<localFileList.size();i++) {			
			LocalFile lf=localFileList.get(i);
			String marketID=lf.getMarketID();
			String path=lf.getPath();
			String filePrefix=lf.getFilePrefix();
			String fileBZ=lf.getFileBZ();
			String fileSuffix=lf.getFileSuffix();
			/*StringBuffer sb=new StringBuffer(path);
			sb.append(filePrefix);*/
	
			if(FenkuDomain.SH_MARKET.equalsIgnoreCase(marketID)) {	
				/*据文件名＝“前缀” ＋“标识” ＋“.” ＋“后缀”；
				前缀为文件代码，如 zhzl、 jsmx 等；
				标识＝清算编号|结算代码|其它|空；
				后缀为数据日期，格式为 mdd 格式，其中 m 表示月， dd 表示日。当月份为 10、 11、 12 月时， m
				的值分别为‘a’、‘b’、‘c’。
				如 2001 年 12 月 31 日发送给 JS001 结算参与人的 jsmx 数据的文件名称为“jsmxjs001.c31”。*/
				//标识
				if(FenkuDomain.SH_CLEANING_TYPE.equalsIgnoreCase(fileBZ)) {					
					List<Clearing> clearingList=getClearingList();
					for(int j=0;j<clearingList.size();j++) {
						StringBuffer sb=new StringBuffer(path);
						sb.append(filePrefix);
						if(filePrefix.trim().equalsIgnoreCase("jsmx01")||
								filePrefix.trim().equalsIgnoreCase("jsmx02")||
								filePrefix.trim().equalsIgnoreCase("jsmx03")) {
							sb.append("_");
						}
						sb.append(clearingList.get(j).getClearingNo());
						sb.append(".");
						sb.append(FenkuUtil.getHexdateString());
						Task currentTask=new Task();
						currentTask.setTaskDate(currDate);
						currentTask.setTrueFileName(sb.toString());
						currentTask.setTaskStatus(FenkuDomain.FILE_NOT_COME);
						currentTask.setTaskDesc("FILE_NOT_COME");
						taskMapper.insertSelective(currentTask);
					}
				}else  if(FenkuDomain.SH_SETTLE_TYPE.equalsIgnoreCase(fileBZ)){
					List<Settle> settleList=getSettleList();
					for(int j=0;j<settleList.size();j++) {
						StringBuffer sb=new StringBuffer(path);
						sb.append(filePrefix);
						if(filePrefix.trim().equalsIgnoreCase("jsmx01")||
								filePrefix.trim().equalsIgnoreCase("jsmx02")||
								filePrefix.trim().equalsIgnoreCase("jsmx03")) {
							sb.append("_");
						}
						sb.append(settleList.get(j).getSettleNo());
						sb.append(".");
						sb.append(FenkuUtil.getHexdateString());
						Task currentTask=new Task();
						currentTask.setTaskDate(currDate);
						currentTask.setTrueFileName(sb.toString());
						currentTask.setTaskStatus(FenkuDomain.FILE_NOT_COME);
						currentTask.setTaskDesc("FILE_NOT_COME");
						taskMapper.insertSelective(currentTask);
					}
				}
			}else if(FenkuDomain.SZ_MARKET.equalsIgnoreCase(marketID)) {
				/**
				 * 文件名采用接口名+4 位日期的命名规则+.dbf
				 */
				String shortDate=DateFormatUtils.format(Calendar.getInstance(), "MMdd");
				StringBuffer sb=new StringBuffer(path);
				sb.append(filePrefix).append(shortDate).append(".DBF");
				Task currentTask=new Task();
				currentTask.setTaskDate(currDate);
				currentTask.setTrueFileName(sb.toString());
				currentTask.setTaskStatus(FenkuDomain.FILE_NOT_COME);
				currentTask.setTaskDesc("FILE_NOT_COME");
				taskMapper.insertSelective(currentTask);
			}			
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
