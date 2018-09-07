package com.nuc.extendAndClass;
/*
 * super表示父类对象，只能用在子类中 ，不允许使用在static修饰的方法；
 * 如果在子类构造方法中，调用父类构造方法，此时必须写在程序第一行；
 * */
public class Emp extends Person{
	private String no;
	//写有参数构造方法时，把无参数写上
	public Emp(){}
	public Emp(String no,String name,String age){
		//调用父类有参构造方法初始化变量
		super(name,age);//调用super时需要放到第一行
		this.no = no;
//		this.name = name;
//		this.age = age;
	}
	@Override
	public void read(){
		System.out.println("说方言！");
	}
	
	public void study(){
		System.out.println("学习！");
	}
	
	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no = no;
	}
}
