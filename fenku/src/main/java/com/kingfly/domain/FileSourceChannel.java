package com.kingfly.domain;

public class FileSourceChannel {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_source_channel.file_source_channel_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private Integer fileSourceChannelId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_source_channel.file_source_channel_path
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private String fileSourceChannelPath;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column file_source_channel.file_type
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private String fileType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_source_channel.file_source_channel_id
	 * @return  the value of file_source_channel.file_source_channel_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public Integer getFileSourceChannelId() {
		return fileSourceChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_source_channel.file_source_channel_id
	 * @param fileSourceChannelId  the value for file_source_channel.file_source_channel_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setFileSourceChannelId(Integer fileSourceChannelId) {
		this.fileSourceChannelId = fileSourceChannelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_source_channel.file_source_channel_path
	 * @return  the value of file_source_channel.file_source_channel_path
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public String getFileSourceChannelPath() {
		return fileSourceChannelPath;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_source_channel.file_source_channel_path
	 * @param fileSourceChannelPath  the value for file_source_channel.file_source_channel_path
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setFileSourceChannelPath(String fileSourceChannelPath) {
		this.fileSourceChannelPath = fileSourceChannelPath == null ? null : fileSourceChannelPath.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column file_source_channel.file_type
	 * @return  the value of file_source_channel.file_type
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column file_source_channel.file_type
	 * @param fileType  the value for file_source_channel.file_type
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType == null ? null : fileType.trim();
	}
}