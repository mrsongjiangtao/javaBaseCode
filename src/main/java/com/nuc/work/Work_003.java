package com.nuc.work;

public class Work_003 {
	//�ڿ���̨���������ֱ�ǡ�������������
	public static void koujue(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	
	//����������
	public static void dengyao(){
		for(int i=0;i<4;i++){
			for(int a=3;a>i;a--){
				System.out.print(" ");
			}
			for(int b=0;b<2*i+1;b++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//ֱ��������
	public static void zhijiao(){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//��ֱ��������
	public static void fanzhijiao(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//������������
	public static void daosanjiao(){
		for(int i=0;i<=2;i++){
			for(int j=0;j<=4-i;j++){
				if(i<=j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		koujue();
		dengyao();
		zhijiao();
		fanzhijiao(5);//5�еķ�ֱ��������
		daosanjiao();
	}

}
