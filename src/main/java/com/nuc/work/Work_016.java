package com.nuc.work;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work_016 {
	public static String[] getLastWeekDays(String date){
		String[] dateArr = new String[7];//结果
		Calendar cal = Calendar.getInstance();
		Work_015 w015 = new Work_015();
		String s = w015.getAnySundayDate(date);//给定日期所在周的周日日期
		Date d = Date.valueOf(s);
		cal.setTime(d);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		
		cal.add(Calendar.DAY_OF_WEEK, -7);
		dateArr[6] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[5] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[4] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[3] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[2] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[1] = simple.format(cal.getTime());
		
		cal.add(Calendar.DAY_OF_WEEK, -1);
		dateArr[0] = simple.format(cal.getTime());
		
		return dateArr;
	}
	public static void main(String[] args) {
		String[] res = getLastWeekDays("2018-7-10");
		for(String s:res){
			System.out.println(s);
		}
	}

}
