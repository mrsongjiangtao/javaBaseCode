package com.nuc.basic;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		System.out.println("-----for------");
		
		//forѭ�����ṹ�����1-5֮������,�Լ����ǵĺ�
		int sum =0;
		for(int i=1;i<=5;i++){
			System.out.println("i="+i);
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("-----while1------");
		
		//while
		int j=1;
		while(j<=5){
			System.out.println("j="+j);
			j++;
		}
		
		System.out.println("-----while2------");

		//һ������£���֪��ѭ��������֪��ʲôʱ���˳�����ʱ��while  ����һ��for
		int a=1;
		while(true){
			if(a==3){
				break;//break ��ʾ�˳�����ѭ�������ж�
			}
			System.out.println("a="+a);
			a++;
		}
		
		System.out.println("-----do while------");

		//do whileѭ�� ����ִ��һ�Σ�Ȼ�����ж��Ƿ���������������ѭ��
		int k = 3;
		do{
			System.out.println("i="+k);
			k--;
		}
		while(k>0);
		
		System.out.println("-----continue------");

		//continue ֻ������ѭ�����У���ʾ�˳���ǰѭ����������һ��ѭ��
		for(int n=1;n<=3;n++){
			if(n==2){
				continue;
			}
			System.out.println("n="+n);//�����2
		}
	}
}
