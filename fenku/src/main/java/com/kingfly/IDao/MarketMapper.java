package com.kingfly.IDao;

import com.kingfly.domain.Market;

public interface MarketMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int deleteByPrimaryKey(String marketId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insert(Market record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insertSelective(Market record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	Market selectByPrimaryKey(String marketId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKeySelective(Market record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKey(Market record);
}