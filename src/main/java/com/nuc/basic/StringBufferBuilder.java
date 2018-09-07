package com.nuc.basic;

public class StringBufferBuilder {

	public static void main(String[] args) {
		String str = "a"+"b"+"c";//字符串常量池中：a,b,c,ab,abc
		//StringBuilder(线程不安全)
		//StringBuffer(线程安全)是可变长度字符串，使用append方法拼接字符串，效率高
		//默认有16位缓冲区
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("s").append("j").append("t");//s,j,t,sjt
		
		//获取该字符串真实长度
		int i = strBuilder.capacity();
		System.out.println(i);
		
		//获取字符串中字符个数
		int length = strBuilder.length();
		System.out.println(length);
		
		System.out.println(strBuilder);
	}
}
