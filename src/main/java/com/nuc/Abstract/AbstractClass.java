package com.nuc.Abstract;
/**
 * abstract声明的类是抽象类：含有抽象方法的类是抽象类
 * 不能被实例化，通过子类来继承，将所有抽象方法进行重写
 * 可以有普通方法；
 * 声明的方法为抽象方法：
 * 没有具体实现，仅是方法的定义，没有方法体；
 * */
public abstract class AbstractClass {
	private String foodName;
	public AbstractClass(){}
	public AbstractClass(String foodName){
		this.foodName = foodName;
	}
	public abstract void eat(String foodName);
	public void drink(){//可以有普通方法
		System.out.println("喝");
	}
	
	public String getFoodName(){
		return foodName;
	}
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
}
