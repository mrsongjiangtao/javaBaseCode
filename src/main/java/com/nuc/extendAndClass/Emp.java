package com.nuc.extendAndClass;
/*
 * super��ʾ�������ֻ������������ ��������ʹ����static���εķ�����
 * ��������๹�췽���У����ø��๹�췽������ʱ����д�ڳ����һ�У�
 * */
public class Emp extends Person{
	private String no;
	//д�в������췽��ʱ�����޲���д��
	public Emp(){}
	public Emp(String no,String name,String age){
		//���ø����вι��췽����ʼ������
		super(name,age);//����superʱ��Ҫ�ŵ���һ��
		this.no = no;
//		this.name = name;
//		this.age = age;
	}
	@Override
	public void read(){
		System.out.println("˵���ԣ�");
	}
	
	public void study(){
		System.out.println("ѧϰ��");
	}
	
	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no = no;
	}
}
