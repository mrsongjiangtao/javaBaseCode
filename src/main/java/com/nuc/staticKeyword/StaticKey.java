package com.nuc.staticKeyword;
/*
 * static 声明方法为静态方法，声明属性为静态属性；永远只被实例化一次；
 * static 声明的变量会被同一个类不同实例共享；
 * 类名可以直接打点调用静态方法或者属性；
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
