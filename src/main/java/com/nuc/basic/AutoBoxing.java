package com.nuc.basic;

public class AutoBoxing {
	//�������һ����ֵ��������Ĭ��Ϊ0������ int 
	//���Ĭ��Ϊnull������Integer
	//�����ֱ�Ӳ������㣬��int
	
	static Integer i;//Ĭ��ֵΪnull
	static Integer j = new Integer(10);
	public static void main(String[] args) {
		//���÷���
		//��1��parseInt("") ���������ַ�����תΪint����
		int a = Integer.parseInt("10");//������������ַ�������NumberFormatException
		//�ղ�������Ľ����Ϊ��
		int sum = i!=null&&j!=null?i+j:0;//ע�⣺�ղ�����ֵ���㣬��ᱨ��ָ�룬��ʱע�⣬Ҫ�ж��Ƿ�Ϊ��
		System.out.println(sum);
		
		//��2��toString()����ֵתΪstring����
		String str = j.toString();
		
		//(3)valueOf("")��������������תΪInteger����
		Integer v1 = Integer.valueOf(10);
		Integer v2=Integer.valueOf("123");
	}

}
