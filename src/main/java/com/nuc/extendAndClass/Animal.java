package com.nuc.extendAndClass;

public class Animal {
	 private String name;//����
	 private String health;//����ָ��
	 private String color;//ëɫ
	 
	 static{//��̬��ʼ����
		 System.out.println("ANIMAL��̬��ʼ���飡");
	 }
	 {//��ʼ����
		 System.out.println("ANIMAL��ʼ���飡");
	 }
	 //�޲ι��췽��
	 public Animal(){
		 System.out.println("�����޲������췽����ִ�У�");
	 }
	 
	//get set ����
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
