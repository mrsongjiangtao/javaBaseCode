package com.nuc.work;

import java.sql.Date;
import java.util.Calendar;

public class Work_014 {
	public int dayBetweenSunday(String date){//获得当前日期与本周日相差的天数 
		int res = 0;
		Calendar cal = Calendar.getInstance();
		if(date!=null){
			Date d = Date.valueOf(date);
			cal.setTime(d);
			int weekday = cal.get(Calendar.DAY_OF_WEEK)-1;
			res = 7-weekday;
		}
		
		return res;
	}
	public static void main(String[] args) {
//		System.out.println(dayBetweenSunday("2018-7-11"));
	}

}
