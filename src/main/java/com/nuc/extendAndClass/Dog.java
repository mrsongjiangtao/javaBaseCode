package com.nuc.extendAndClass;

public class Dog extends Animal{
	static{
		System.out.println("DOG��̬��ʼ���飡");
	}
	{
		System.out.println("DOG��ʼ���飡");
	}
	public Dog(){}
	public Dog(String a){
		System.out.println("DOG�޲������췽����ִ��");
	}
	public void eat(String food){
		System.out.println("Dog�ԣ�"+food);
	}
}
