package com.nuc.basic;

public class AutoBoxing {
	//如果定义一个数值，想让它默认为0，则定义 int 
	//如果默认为null，则定义Integer
	//如果想直接参与运算，则int
	
	static Integer i;//默认值为null
	static Integer j = new Integer(10);
	public static void main(String[] args) {
		//常用方法
		//（1）parseInt("") 将纯数字字符串，转为int类型
		int a = Integer.parseInt("10");//如果不是数字字符串，则NumberFormatException
		//空参与运算的结果还为空
		int sum = i!=null&&j!=null?i+j:0;//注意：空参与数值运算，则会报空指针，此时注意，要判断是否为空
		System.out.println(sum);
		
		//（2）toString()将数值转为string类型
		String str = j.toString();
		
		//(3)valueOf("")将其他数据类型转为Integer类型
		Integer v1 = Integer.valueOf(10);
		Integer v2=Integer.valueOf("123");
	}

}
