package com.nuc.work;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work_015 {//获得任意日期所在周星期日的日期
	public String getAnySundayDate(String date){
		String res = null;//结果
		Work_014 w014 = new Work_014();
		int i = w014.dayBetweenSunday(date);//给定日期与礼拜天相差几天
		Calendar cal = Calendar.getInstance();
		Date d = Date.valueOf(date);//字符串转日期
		cal.setTime(d);//改变日历为给定日期
		cal.add(Calendar.DAY_OF_MONTH, i);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		res = simple.format(cal.getTime());
		return res;
	}
	public static void main(String[] args) {
//		System.out.println(getAnySundayDate("2018-7-3"));
	}

}
