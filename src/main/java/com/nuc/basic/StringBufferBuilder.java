package com.nuc.basic;

public class StringBufferBuilder {

	public static void main(String[] args) {
		String str = "a"+"b"+"c";//�ַ����������У�a,b,c,ab,abc
		//StringBuilder(�̲߳���ȫ)
		//StringBuffer(�̰߳�ȫ)�ǿɱ䳤���ַ�����ʹ��append����ƴ���ַ�����Ч�ʸ�
		//Ĭ����16λ������
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("s").append("j").append("t");//s,j,t,sjt
		
		//��ȡ���ַ�����ʵ����
		int i = strBuilder.capacity();
		System.out.println(i);
		
		//��ȡ�ַ������ַ�����
		int length = strBuilder.length();
		System.out.println(length);
		
		System.out.println(strBuilder);
	}
}
