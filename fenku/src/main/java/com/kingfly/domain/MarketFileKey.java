package com.kingfly.domain;

public class MarketFileKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_file.market_file_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private Integer marketFileId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market_file.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private String marketId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_file.market_file_id
	 * @return  the value of market_file.market_file_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public Integer getMarketFileId() {
		return marketFileId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_file.market_file_id
	 * @param marketFileId  the value for market_file.market_file_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setMarketFileId(Integer marketFileId) {
		this.marketFileId = marketFileId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market_file.market_id
	 * @return  the value of market_file.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public String getMarketId() {
		return marketId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market_file.market_id
	 * @param marketId  the value for market_file.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId == null ? null : marketId.trim();
	}
}