package com.kingfly.domain;

public class Market {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private String marketId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column market.market_name
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	private String marketName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market.market_id
	 * @return  the value of market.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public String getMarketId() {
		return marketId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market.market_id
	 * @param marketId  the value for market.market_id
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setMarketId(String marketId) {
		this.marketId = marketId == null ? null : marketId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column market.market_name
	 * @return  the value of market.market_name
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public String getMarketName() {
		return marketName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column market.market_name
	 * @param marketName  the value for market.market_name
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	public void setMarketName(String marketName) {
		this.marketName = marketName == null ? null : marketName.trim();
	}
}