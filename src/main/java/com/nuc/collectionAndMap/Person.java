package com.nuc.collectionAndMap;

public class Person {
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		Person p1 = (Person)obj;
		Person p2 = this;
		/*if(p!=null&&p.getName()!=null&&p2.getName()!=null){
			if(p.getName().equals(p2.getName())){
				return true;
			}
		}*/
		if(p1.hashCode()==p2.hashCode()){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		if(name!=null){
			return name.hashCode();
		}
		return this.hashCode();
	}
	
}
