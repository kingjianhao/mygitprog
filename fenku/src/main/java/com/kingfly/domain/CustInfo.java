package com.kingfly.domain;

public class CustInfo extends CustInfoKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.custname
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String custname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.sh_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String shAccountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.sz_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String szAccountNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.send_type
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String sendType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.send_type_description
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String sendTypeDescription;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cust_info.mail_address
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    private String mailAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.custname
     *
     * @return the value of cust_info.custname
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getCustname() {
        return custname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.custname
     *
     * @param custname the value for cust_info.custname
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.sh_account_NO
     *
     * @return the value of cust_info.sh_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getShAccountNo() {
        return shAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.sh_account_NO
     *
     * @param shAccountNo the value for cust_info.sh_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setShAccountNo(String shAccountNo) {
        this.shAccountNo = shAccountNo == null ? null : shAccountNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.sz_account_NO
     *
     * @return the value of cust_info.sz_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getSzAccountNo() {
        return szAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.sz_account_NO
     *
     * @param szAccountNo the value for cust_info.sz_account_NO
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setSzAccountNo(String szAccountNo) {
        this.szAccountNo = szAccountNo == null ? null : szAccountNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.send_type
     *
     * @return the value of cust_info.send_type
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getSendType() {
        return sendType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.send_type
     *
     * @param sendType the value for cust_info.send_type
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setSendType(String sendType) {
        this.sendType = sendType == null ? null : sendType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.send_type_description
     *
     * @return the value of cust_info.send_type_description
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getSendTypeDescription() {
        return sendTypeDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.send_type_description
     *
     * @param sendTypeDescription the value for cust_info.send_type_description
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setSendTypeDescription(String sendTypeDescription) {
        this.sendTypeDescription = sendTypeDescription == null ? null : sendTypeDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cust_info.mail_address
     *
     * @return the value of cust_info.mail_address
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cust_info.mail_address
     *
     * @param mailAddress the value for cust_info.mail_address
     *
     * @mbg.generated Sun Apr 01 14:50:31 CST 2018
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress == null ? null : mailAddress.trim();
    }
}