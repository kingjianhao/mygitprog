package com.kingfly.IDao;

import com.kingfly.domain.MarketFile;
import com.kingfly.domain.MarketFileKey;

public interface MarketFileMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int deleteByPrimaryKey(MarketFileKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insert(MarketFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int insertSelective(MarketFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	MarketFile selectByPrimaryKey(MarketFileKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKeySelective(MarketFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_file
	 * @mbg.generated  Fri Apr 06 23:24:27 CST 2018
	 */
	int updateByPrimaryKey(MarketFile record);
}