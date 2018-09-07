package com.nuc.basic;//程序的包，描述该类在项目中所在位置，包，即文件夹

public class variable {
	//类中声明的变量，局部变量和全局变量(类变量，成员变量)；
	//全局变量：
	static byte b=1;
	short s1 = 123;
	int i = 12;
	long j = 123456789L;
	float f = 10.22F;//默认程序中小数位double类型 =号表示赋值，两边数据类型要一致
	double d = 23.22;//可以加D也可以不加
	boolean bool_0 = true;//布尔类型 true和false java中没有真假
	boolean bool_1 = false;
	char c = '宋';//字符型2个字节，可存放一个汉字
	final double PI = 3.1415926;//常量：定义时必须赋初始值，而且不允许再次赋值，常量名大写
	public void read(){
		System.out.println(b);//普通方法中可以直接调用静态的全局变量
		System.out.println(d);//普通方法中可以直接调用全局变量
	}
	public static void main(String[] args){
		int age;//局部变量，必须赋初始值，或者在使用前，有赋值动作
		age = 10;
		System.out.println("age="+age);
		System.out.println(b);//main方法是静态的，可以直接输出静态变量
//		System.out.println(i);//非静态的不能直接输出，只能创建类调用
		variable v = new variable();
		System.out.println(v.i);
		System.out.println("--------read方法--------");
		v.read();
	}
}
