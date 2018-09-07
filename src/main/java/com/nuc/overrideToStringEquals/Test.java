package com.nuc.overrideToStringEquals;

public class Test {
	
	public static void main(String[] args) {
		Person p1 = new Person("101","JONES",22);
		Person p2 = new Person("101","JONES",22);
		boolean f = p1.equals(p2);
		System.out.println(f);
		//输出某个对象是，就隐式调用了toString方法，该方法是父类Object中的
		System.out.println(p1);
		System.out.println(p1.toString());
	}

}
