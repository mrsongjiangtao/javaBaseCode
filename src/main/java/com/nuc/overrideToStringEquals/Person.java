package com.nuc.overrideToStringEquals;

public class Person {
	private String cardno;
	private String name;
	private int age;
	public Person(){}
	public Person(String cardno,String name,int age){
		this.cardno = cardno;
		this.name = name;
		this.age = age;
	}
	//ʲôʱ����дequals�������Ƚ���������ʱ����Ҫ��дequals���������¶���ȽϹ���
	@Override
	public boolean equals(Object obj){
		Person p1 = (Person)obj;//���Ƚϵ���һ��Person����
		Person p2 = this;//��ǰ���󣬼�˭�������equals�����������˭
		if(p1.cardno!=null&&p2.cardno!=null){
			if(p1.cardno.equals(p2.cardno)){
				if(p1.name!=null&p2.name!=null&&p1.name.equals(p2.name)){
					if(p1.age>0&&p2.age>0&&p1.age==p2.age){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	//��дtoString������Ŀ���ǣ��ö�����ĳ���ַ�����ʽ��ʾ
	@Override
	public String toString(){
		return "������"+name+"--���䣺"+age+"--cardno"+cardno;
	}
	
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
