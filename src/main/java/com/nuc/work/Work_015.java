package com.nuc.work;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work_015 {//����������������������յ�����
	public String getAnySundayDate(String date){
		String res = null;//���
		Work_014 w014 = new Work_014();
		int i = w014.dayBetweenSunday(date);//�������������������
		Calendar cal = Calendar.getInstance();
		Date d = Date.valueOf(date);//�ַ���ת����
		cal.setTime(d);//�ı�����Ϊ��������
		cal.add(Calendar.DAY_OF_MONTH, i);
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		res = simple.format(cal.getTime());
		return res;
	}
	public static void main(String[] args) {
//		System.out.println(getAnySundayDate("2018-7-3"));
	}

}
