package com.nuc.staticKeyword;
/*
 * static ��������Ϊ��̬��������������Ϊ��̬���ԣ���Զֻ��ʵ����һ�Σ�
 * static �����ı����ᱻͬһ���಻ͬʵ������
 * ��������ֱ�Ӵ����þ�̬�����������ԣ�
 * */
public class StaticKey {
	private String StaticKeyname;
	private static String pwd;
	public static void main(String args[]){  
	   StaticKey s1=new StaticKey();
	   s1.StaticKeyname="JONES";
	   s1.pwd="123456";
	 
	   StaticKey s2=new StaticKey();
	   
	   System.out.println(s2.StaticKeyname+":"+s2.pwd);
	   System.out.println(StaticKey.pwd);
   }
}
