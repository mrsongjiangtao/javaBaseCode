package com.nuc.work;

public class Work_001 {
	//��1-100֮�������ͣ���ͳ�Ƹ�����(ֻ�ܱ�1��������������)
	public static void getSuShu(){
		int sum = 0;
		int num = 0;
		for(int i=1;i<=100;i++){
			int a=0;//������������
			for(int j=1;j<=i;j++){
				if(i%j==0){
					a++;
				}
			}
			if(a==2){//ֻ������1�ͱ���
				System.out.println(i);
				sum+=i;
				num+=1;
			}
		}
		System.out.println("��Ϊ��"+sum);
		System.out.println("����Ϊ��"+num);
	}
	public static void main(String[] args) {
		Work_001.getSuShu();
	}

}
