package com.nuc.work;

public class Work_008 {
	//����1234 ������ʾ4321
	public static void getRes(){
		int j=1234;
		int a = 1000;
		int res =0;
		for(int i=1;i<=4;i++){
			int x = j%10;//xΪ��λ
			res = res+x*a;
			a=a/10;//100
			j=j/10;//123.4 ����Ϊ123
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		getRes();
	}

}
