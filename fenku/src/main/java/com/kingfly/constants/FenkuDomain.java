package com.kingfly.constants;

public class FenkuDomain {
	public static final String HEX_DATE_PATTERN="MDD";
	public static final String DEC_DATE_PATTERN="MMDD";
	
	/*
	 * 文件状态
	 */
	//文件未到达
	public static final String FILE_NOT_COME="00";
	//文件到达
	public static final String FILE_EXIST="01";
	//文件处理中
	public static final String FILE_PROCESSING="02";
	//文件处理完成
	public static final String FILE_FINISHED="03";
	
	/*
	 * 市场分类
	 */
	public static final String SH_MARKET="00";
	public static final String SZ_MARKET="01";
	public static final String NBQ_MARKET="02";
	
	/**
	 * 上海文件标志类别 
	 */
	//清算会员编号
	public static final String SH_CLEANING_TYPE="00";
	//结算会员编号
	public static final String SH_SETTLE_TYPE="01";
}
