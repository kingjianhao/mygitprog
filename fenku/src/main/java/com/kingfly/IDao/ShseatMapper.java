package com.kingfly.IDao;

import com.kingfly.domain.Shseat;

public interface ShseatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    int deleteByPrimaryKey(String shSeatNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    int insert(Shseat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    int insertSelective(Shseat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    Shseat selectByPrimaryKey(String shSeatNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    int updateByPrimaryKeySelective(Shseat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sh_seat
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    int updateByPrimaryKey(Shseat record);
}