package com.nuc.extendAndClass;

public class Person {
	private String name;
	private String age;
	public Person(){}
	public Person(String name,String age){
		  this.name=name;
		  this.age=age;
	}
	public Person(String name){
		  this.name=name;
	}
	public void read(){
		  System.out.println("说中国话！");
	  }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
