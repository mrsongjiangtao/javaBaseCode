package com.nuc.Abstract;
/**
 * abstract���������ǳ����ࣺ���г��󷽷������ǳ�����
 * ���ܱ�ʵ������ͨ���������̳У������г��󷽷�������д
 * ��������ͨ������
 * �����ķ���Ϊ���󷽷���
 * û�о���ʵ�֣����Ƿ����Ķ��壬û�з����壻
 * */
public abstract class AbstractClass {
	private String foodName;
	public AbstractClass(){}
	public AbstractClass(String foodName){
		this.foodName = foodName;
	}
	public abstract void eat(String foodName);
	public void drink(){//��������ͨ����
		System.out.println("��");
	}
	
	public String getFoodName(){
		return foodName;
	}
	public void setFoodName(String foodName){
		this.foodName = foodName;
	}
}
