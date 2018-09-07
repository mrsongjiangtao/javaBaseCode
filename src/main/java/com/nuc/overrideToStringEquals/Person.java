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
	//什么时候重写equals方法？比较两个对象时候，需要重写equals方法，重新定义比较规则
	@Override
	public boolean equals(Object obj){
		Person p1 = (Person)obj;//被比较的另一个Person对象
		Person p2 = this;//当前对象，即谁点出来的equals方法，则就是谁
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
	
	//重写toString方法的目的是：让对象以某个字符串形式表示
	@Override
	public String toString(){
		return "姓名："+name+"--年龄："+age+"--cardno"+cardno;
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
