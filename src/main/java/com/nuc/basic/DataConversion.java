package com.nuc.basic;
/*
 * Java ��=�����߸�ֵ��������������һ�£������һ��������ת����ʽ
 * (1)��ʽת����ϵͳ���Զ�ת���������ͣ�
 *   
 * (2)ǿ��ת����=�������������Ͳ�ͬ�������Ҫǿת������Ҫͨ��(����)ǿת
 * 
 * */
public class DataConversion {

	public static void main(String[] args) {
		int i = 111;
		short s = 10;//�Ҳ�int����10 ���short���ͣ��ڱ�������ʱֱ�Ӹ���ʼֵ����ϵͳ��ʽת����
		byte j = 10;
		
		//��1������֮����������ǿ��ת������long->int->short->byte 
		i = (short)s;//ǿ��ת��
		j = (byte)s;
		
		//��2��������֮�䣺double->float 
		float f_0=10.1F;
		double d_0=10.123456789123456789;
		
		//doule->float��Ҫǿתע�⾫������(С��λ���ܻ����)
		f_0 = (float)d_0;
		//d_0=f_0;//float->double����Ҫǿ��ת����(��ʱ���ȸ���,С��λ��������)
		System.out.println(d_0);
		
		//��3��char������    ����->char
		char c = 97;//��ʽת��
		System.out.println(c);//���a
		
		int a = 98;
		c = (char)a;
		System.out.println(c);//b
		
		//��4��char�͸�����
		float f=99.5F;
		c=(char) f;//floatתΪint תΪchar
		System.out.println(c);//���c
		
		//��5�������ͺ�����   (double/float)->(long/int/short/byte) ��С������ȥ
		double d=10.231;
		long l=(long) d;//���Ϊ10
		System.out.println(l);
		
	}

}
