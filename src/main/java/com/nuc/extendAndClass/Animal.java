package com.nuc.extendAndClass;

public class Animal {
	 private String name;//名字
	 private String health;//健康指数
	 private String color;//毛色
	 
	 static{//静态初始化块
		 System.out.println("ANIMAL静态初始化块！");
	 }
	 {//初始化块
		 System.out.println("ANIMAL初始化块！");
	 }
	 //无参构造方法
	 public Animal(){
		 System.out.println("父类无参数构造方法被执行！");
	 }
	 
	//get set 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHealth() {
		return health;
	}
	public void setHealth(String health) {
		this.health = health;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 
	 
}
