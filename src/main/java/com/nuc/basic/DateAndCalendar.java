package com.nuc.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * java中的日期类：
 * java.sql.Date(将yyyy-mm-dd格式字符串转为日期对象)
 * sql包下Date常用方法：static valueOf("yyyy-mm-dd")
 * java.util.Date(只用于获取系统当前时间)
 * util包中Date常用方法：
 * (1)new Date()获取当前系统时间 
 * (2)getTime()返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
 * 
 */
public class DateAndCalendar {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("当前毫秒数："+d.getTime());
		
		java.sql.Date d2 = java.sql.Date.valueOf("2018-7-10");
		System.out.println(d2);
		
		//日期格式化
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日 HH/mm/ss");//参数为要格式化后的格式
		String str = simple.format(d2);
		System.out.println(str);
		
		//将一个日期格式字符串，转为Date
		String s = "1999年10月11日 12/23/22";//注意：字符串格式，必须跟SimpleDateFormat指定个格式一致
		Date d3 = simple.parse(s);
		System.out.println(d3);
		
		System.out.println("------Calendar-----");
		Calendar cal = Calendar.getInstance();//该对象中存放，系统时间
		//获取年
		int year = cal.get(Calendar.YEAR);
		//获取月份
		int month = cal.get(Calendar.MONTH)+1;//0-11 表示1-12月
		//获取日期
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//星期
		int date = cal.get(Calendar.DAY_OF_WEEK)-1;//1-7 周日-周六
		System.out.println(year+"年"+month+"月"+day+"日"+"星期"+date);
		
		//设置日期,set方法可修改年月日时分秒
		cal.set(Calendar.DAY_OF_MONTH,12);
		month = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日"+"星期"+date);		
		
		//将日期加1天， 月份减一个月
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DAY_OF_MONTH, 1);
	    cal2.add(Calendar.MONTH, -1);
	    int year2 = cal2.get(Calendar.YEAR);
	    int month2 = cal2.get(Calendar.MONTH)+1;
	    int day2 = cal2.get(Calendar.DAY_OF_MONTH);
	    int date2 = cal2.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(year2+"年"+month2+"月"+day2+"日"+"星期"+date2);		
		
		//Calendar转为Date类型，然后格式化
		Date date1 = cal.getTime();
		SimpleDateFormat simple1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String res = simple1.format(date1);
		System.out.println(res);
		
		//Date->calendar
		Calendar c = Calendar.getInstance();
		c.setTime(java.sql.Date.valueOf("1999-9-9"));
		System.out.println(c.getTime());
		
	}

}
