package com.nuc.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * java�е������ࣺ
 * java.sql.Date(��yyyy-mm-dd��ʽ�ַ���תΪ���ڶ���)
 * sql����Date���÷�����static valueOf("yyyy-mm-dd")
 * java.util.Date(ֻ���ڻ�ȡϵͳ��ǰʱ��)
 * util����Date���÷�����
 * (1)new Date()��ȡ��ǰϵͳʱ�� 
 * (2)getTime()������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�����
 * 
 */
public class DateAndCalendar {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("��ǰ��������"+d.getTime());
		
		java.sql.Date d2 = java.sql.Date.valueOf("2018-7-10");
		System.out.println(d2);
		
		//���ڸ�ʽ��
		SimpleDateFormat simple = new SimpleDateFormat("yyyy��MM��dd�� HH/mm/ss");//����ΪҪ��ʽ����ĸ�ʽ
		String str = simple.format(d2);
		System.out.println(str);
		
		//��һ�����ڸ�ʽ�ַ�����תΪDate
		String s = "1999��10��11�� 12/23/22";//ע�⣺�ַ�����ʽ�������SimpleDateFormatָ������ʽһ��
		Date d3 = simple.parse(s);
		System.out.println(d3);
		
		System.out.println("------Calendar-----");
		Calendar cal = Calendar.getInstance();//�ö����д�ţ�ϵͳʱ��
		//��ȡ��
		int year = cal.get(Calendar.YEAR);
		//��ȡ�·�
		int month = cal.get(Calendar.MONTH)+1;//0-11 ��ʾ1-12��
		//��ȡ����
		int day = cal.get(Calendar.DAY_OF_MONTH);
		//����
		int date = cal.get(Calendar.DAY_OF_WEEK)-1;//1-7 ����-����
		System.out.println(year+"��"+month+"��"+day+"��"+"����"+date);
		
		//��������,set�������޸�������ʱ����
		cal.set(Calendar.DAY_OF_MONTH,12);
		month = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+month+"��"+day+"��"+"����"+date);		
		
		//�����ڼ�1�죬 �·ݼ�һ����
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DAY_OF_MONTH, 1);
	    cal2.add(Calendar.MONTH, -1);
	    int year2 = cal2.get(Calendar.YEAR);
	    int month2 = cal2.get(Calendar.MONTH)+1;
	    int day2 = cal2.get(Calendar.DAY_OF_MONTH);
	    int date2 = cal2.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(year2+"��"+month2+"��"+day2+"��"+"����"+date2);		
		
		//CalendarתΪDate���ͣ�Ȼ���ʽ��
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
