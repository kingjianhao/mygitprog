package com.kingfly.IDao;

import com.kingfly.domain.FileSourceChannel;

public interface FileSourceChannelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int deleteByPrimaryKey(Integer fileSourceChannelId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insert(FileSourceChannel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insertSelective(FileSourceChannel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	FileSourceChannel selectByPrimaryKey(Integer fileSourceChannelId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKeySelective(FileSourceChannel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table file_source_channel
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKey(FileSourceChannel record);
}