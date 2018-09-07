package com.nuc.extendAndClass;

public class Dog extends Animal{
	static{
		System.out.println("DOG静态初始化块！");
	}
	{
		System.out.println("DOG初始化块！");
	}
	public Dog(){}
	public Dog(String a){
		System.out.println("DOG无参数构造方法被执行");
	}
	public void eat(String food){
		System.out.println("Dog吃："+food);
	}
}
