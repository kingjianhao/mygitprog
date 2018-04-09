package com.kingfly.utils;

import java.util.Calendar;

import org.apache.commons.lang3.time.DateFormatUtils;

public class FenkuUtil {
	public static String getHexdateString() {
		String currDate=DateFormatUtils.format(Calendar.getInstance(), "MMdd");
		int mmInt=Integer.parseInt(DateFormatUtils.format(Calendar.getInstance(), "MMdd").substring(0, 2));
		String result="";
		if(mmInt>9) {
			if(mmInt==10) {
				result="a"+currDate.substring(2);
			}
			if(mmInt==11) {
				result="b"+currDate.substring(2);
			}
			if(mmInt==12) {
				result="c"+currDate.substring(2);
			}
		}else {
			result=mmInt+currDate.substring(2);
		}	
		return result;
	}
}
