package com.nuc.extendAndClass;

public class Teacher extends Person {
	private String teaNum;//±‡∫≈
	public void teach(){
		 System.out.println("ΩÃ È£°");
	}
	public Teacher(){}
	public Teacher(String teaNum,String name,String age){
		this.teaNum=teaNum;
		this.setName(name);
		this.setAge(age);
	}
	
	public void setTeaNum(String teaNum){
		this.teaNum = teaNum;
	}
	public String getTeaNum(){
		return teaNum;
	}
}
