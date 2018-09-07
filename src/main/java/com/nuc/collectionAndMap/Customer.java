package com.nuc.collectionAndMap;

public class Customer implements Comparable {
	private String cusName;
	private int age;
	private String cardno;
	public Customer(){}
	public Customer(String cusName,int age,String cardno){
		this.cusName = cusName;
		this.age = age;
		this.cardno = cardno;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
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
	
	//用于比较两个对象大小
	@Override
	public int compareTo(Object arg0) {
		Customer cus = (Customer) arg0;
		if(cus.getAge()==this.getAge()){
			if(cus.getCusName()!=null&&this.getCusName()!=null){
				if(cus.getCusName().equals(this.getCusName())){
					return 0;
				}else if(cus.getCusName().compareTo(this.getCusName())>0){
					return -1;
				}else{
					return 1;
				}
			}
			return 0;
		}else if(this.getAge()>cus.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
}
