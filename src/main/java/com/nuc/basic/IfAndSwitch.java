package com.nuc.basic;

public class IfAndSwitch {

	public static void main(String[] args) {
		//��Ŀ�����
		String str = (10>100)?"YES":"NO";
		int i = (10>100)?(int)10.2:200;
		System.out.println(str+"---"+i);
		
		//�����ж����
		int age = 52;
		if(age>10&&age<=18){
			System.out.println("������1");
		}else{
			System.out.println("����������");
		}
		
		if(age>=10&&age<=18)
			System.out.println("������2"); //ע�⣬û��д{}ֻ��Ժ���һ��������
		
		//������
		if(age<=10){
			System.out.println("����");
		}else if(age>10&&age<=18){
			System.out.println("������");
		}else if(age>=18&&age<25){
			System.out.println("����");
		}else if(age>=25&&age<=50){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
		
		//���̿������,ֻ������ֵ�ж�;����Ҫ��byte��short��int��char��jdk7 String
		
		//switch
		int j=4;
		switch(j){
		case 1:
			System.out.println("j=1");
			break;
		case 2:
			System.out.println("j=2");
			break;
		case 3:
			System.out.println("j=3");
			break;
		default:
			System.out.println("ǰ�治����������");
			break;
		}

	}

}
