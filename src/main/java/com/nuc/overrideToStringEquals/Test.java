package com.nuc.overrideToStringEquals;

public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person("101","JONES",22);
		Person p2 = new Person("101","JONES",22);
		boolean f = p1.equals(p2);
		System.out.println(f);
		//���ĳ�������ǣ�����ʽ������toString�������÷����Ǹ���Object�е�
		System.out.println(p1);
		System.out.println(p1.toString());
	}

}
