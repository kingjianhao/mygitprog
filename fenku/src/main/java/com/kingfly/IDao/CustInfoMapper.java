package com.kingfly.IDao;

import com.kingfly.domain.CustInfo;
import com.kingfly.domain.CustInfoKey;

public interface CustInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	int deleteByPrimaryKey(CustInfoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	int insert(CustInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	int insertSelective(CustInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	CustInfo selectByPrimaryKey(CustInfoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	int updateByPrimaryKeySelective(CustInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cust_info
	 * @mbg.generated  Sun Apr 08 20:58:35 CST 2018
	 */
	int updateByPrimaryKey(CustInfo record);
}