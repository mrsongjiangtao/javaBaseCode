package com.nuc.basic;
//==  equals���� �Ƚ�����
//==�ȱȽ����ݣ�Ҳ�Ƚ��ڴ��ַ�Ƿ���ͬ
//equals�Ƚ�������������
public class EqualsMehtod {
	
	public static void main(String[] args) {
		//�ַ����Ƚϣ���������== ��ֻ��ͨ��equals����
		//�ַ���== ��equals�Ƚ�
		String str1 = "Song";
		String str2 = "Song";
		String str3 = new String("Song");
		
		System.out.println(str1==str2);//true
		System.out.println(str2==str3);//false
		System.out.println(str2.equals(str3));//true
		
		//����������������Integer��intΪ����==��equals�Ƚ�
		int i0 = 10;
		int i1 = 10;
		//i0��i1����int���ͣ���ֱ��==�Ƚ�
		System.out.println(i0==i1);//true
		
		int i2 = 10;
		Integer i3 = 10;
		Integer i4=new Integer(10);
		System.out.println(i2==i3);//true
		System.out.println(i3.equals(i2));//true
		
		System.out.println(i4==i2);//true
		System.out.println(i4.equals(i3));//true
		System.out.println(i4==i3);//false��������������
		
		int i6=new Integer(10);
		Integer i7=10;
		System.out.println(i6==i7);//true
		System.out.println(i7.equals(i6));//true
		
		int i8=new Integer(10);
		int i9=new Integer(10);  
		System.out.println(i8==i9);//true
		
		//127 128 ����
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);//true
		//��һ���ֽڻ����·���ռ�
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);//false
		//ע�⣺���Integer��Integer/int�ȽϾ����Ƿ���ȣ���ʱ���Բ�����ʹ��== 
		String str="10";
		Integer m=10;
		
		System.out.println(m.equals(str));//false
		System.out.println(m.toString().equals(str));//true
		  
		  
	}

}
