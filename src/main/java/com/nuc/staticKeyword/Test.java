package com.nuc.staticKeyword;

public class Test {

	public static void main(String[] args) {
		StaticMethodAndConstructor s = new StaticMethodAndConstructor();
		//��̬��ʼ����ִֻ��һ��
		StaticMethodAndConstructor s1 = new StaticMethodAndConstructor();
		
		s.setAge(20);
		s.setCardno("232302198719293019");
		s.setCusName("JONES");
		s.setEmail("sjtCstp@123.com");
		s.printInfo();
	}

}
