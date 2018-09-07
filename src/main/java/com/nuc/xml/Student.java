package com.nuc.xml;

public class Student {
	private String stuno;
	private String name;
	private String address;
	private Integer age;
	
	public Student(){}
	public Student(String stuno,String name,String address,Integer age){
		this.stuno=stuno;
		this.name=name;
		this.address=address;
		this.age=age;
	}
	
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
