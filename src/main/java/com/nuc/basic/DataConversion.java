package com.nuc.basic;
/*
 * Java 中=号两边赋值操作，必须类型一致，如果不一致有两种转换方式
 * (1)隐式转换：系统会自动转换数据类型；
 *   
 * (2)强制转换：=号两边数据类型不同，如果需要强转，则需要通过(类型)强转
 * 
 * */
public class DataConversion {

	public static void main(String[] args) {
		int i = 111;
		short s = 10;//右侧int类型10 左侧short类型，在变量定义时直接付初始值，则系统隐式转换了
		byte j = 10;
		
		//（1）整型之间数据类型强制转换规则：long->int->short->byte 
		i = (short)s;//强制转换
		j = (byte)s;
		
		//（2）浮点型之间：double->float 
		float f_0=10.1F;
		double d_0=10.123456789123456789;
		
		//doule->float需要强转注意精度问题(小数位可能会减少)
		f_0 = (float)d_0;
		//d_0=f_0;//float->double不需要强制转换，(此时精度更高,小数位可能增多)
		System.out.println(d_0);
		
		//（3）char和整型    整型->char
		char c = 97;//隐式转换
		System.out.println(c);//输出a
		
		int a = 98;
		c = (char)a;
		System.out.println(c);//b
		
		//（4）char和浮点型
		float f=99.5F;
		c=(char) f;//float转为int 转为char
		System.out.println(c);//输出c
		
		//（5）浮点型和整型   (double/float)->(long/int/short/byte) 且小数点舍去
		double d=10.231;
		long l=(long) d;//结果为10
		System.out.println(l);
		
	}

}
