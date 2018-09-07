package com.nuc.staticKeyword;
/*
 * 1�����췽�����÷�����������ͬ��û�з���ֵҲ������ʹ��void ����
 * Ĭ��public����
 * �κ�һ���࣬����һ���޲����Ĺ��췽���� ����ʵ����ʱ��ִ��
 * ���췽�������ڳ�ʼ����Ա����
 * 2����ʼ����
 * 3����̬��ʼ����
 * 
 * ִ��˳�򣺾�̬��ʼ���飨��Զֻ��ִ��һ�Σ� ��ʼ���� ���췽��
 * 
 * */
public class StaticMethodAndConstructor {
	//��ʼ����
	{	  
	  System.out.println("��ʼ���鱻ִ�У�");
	}
	//��̬��ʼ����
	static{
		System.out.println("��̬��ʼ���鱻ִ�У�");
	}
	private String cusName;
	private String email;
	private int age;
	private String cardno;
	
	//�޲��� ���췽��
	public StaticMethodAndConstructor(){
		System.out.println("�޲������췽����ִ�У�");
	}
	//�вι��췽��
	public StaticMethodAndConstructor(String cusName,String email,String cardno,int age){
		this.cusName=cusName;
		this.email=email;
		this.cardno=cardno;
		this.age=age;
	}
	
	//��ͨ����
	public void printInfo(){
		System.out.println("������"+cusName+":���䣺"+email+":cardno:"+cardno+"���䣺"+age);
	}
	
	//get set����
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
