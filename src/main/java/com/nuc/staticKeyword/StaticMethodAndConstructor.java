package com.nuc.staticKeyword;
/*
 * 1、构造方法，该方法与类名相同；没有返回值也不可以使用void 声明
 * 默认public修饰
 * 任何一个类，都有一个无参数的构造方法； 对象实例化时被执行
 * 构造方法常用于初始化成员变量
 * 2、初始化块
 * 3、静态初始化块
 * 
 * 执行顺序：静态初始化块（永远只被执行一次） 初始化块 构造方法
 * 
 * */
public class StaticMethodAndConstructor {
	//初始化块
	{	  
	  System.out.println("初始化块被执行！");
	}
	//静态初始化块
	static{
		System.out.println("静态初始化块被执行！");
	}
	private String cusName;
	private String email;
	private int age;
	private String cardno;
	
	//无参数 构造方法
	public StaticMethodAndConstructor(){
		System.out.println("无参数构造方法被执行！");
	}
	//有参构造方法
	public StaticMethodAndConstructor(String cusName,String email,String cardno,int age){
		this.cusName=cusName;
		this.email=email;
		this.cardno=cardno;
		this.age=age;
	}
	
	//普通方法
	public void printInfo(){
		System.out.println("姓名："+cusName+":邮箱："+email+":cardno:"+cardno+"年龄："+age);
	}
	
	//get set方法
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
}
