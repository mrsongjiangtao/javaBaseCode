package com.nuc.basic;//����İ���������������Ŀ������λ�ã��������ļ���

public class variable {
	//���������ı������ֲ�������ȫ�ֱ���(���������Ա����)��
	//ȫ�ֱ�����
	static byte b=1;
	short s1 = 123;
	int i = 12;
	long j = 123456789L;
	float f = 10.22F;//Ĭ�ϳ�����С��λdouble���� =�ű�ʾ��ֵ��������������Ҫһ��
	double d = 23.22;//���Լ�DҲ���Բ���
	boolean bool_0 = true;//�������� true��false java��û�����
	boolean bool_1 = false;
	char c = '��';//�ַ���2���ֽڣ��ɴ��һ������
	final double PI = 3.1415926;//����������ʱ���븳��ʼֵ�����Ҳ������ٴθ�ֵ����������д
	public void read(){
		System.out.println(b);//��ͨ�����п���ֱ�ӵ��þ�̬��ȫ�ֱ���
		System.out.println(d);//��ͨ�����п���ֱ�ӵ���ȫ�ֱ���
	}
	public static void main(String[] args){
		int age;//�ֲ����������븳��ʼֵ��������ʹ��ǰ���и�ֵ����
		age = 10;
		System.out.println("age="+age);
		System.out.println(b);//main�����Ǿ�̬�ģ�����ֱ�������̬����
//		System.out.println(i);//�Ǿ�̬�Ĳ���ֱ�������ֻ�ܴ��������
		variable v = new variable();
		System.out.println(v.i);
		System.out.println("--------read����--------");
		v.read();
	}
}
