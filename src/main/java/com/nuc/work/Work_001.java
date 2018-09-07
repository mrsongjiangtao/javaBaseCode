package com.nuc.work;

public class Work_001 {
	//求1-100之间素数和，并统计个数；(只能被1和自身整除的数)
	public static void getSuShu(){
		int sum = 0;
		int num = 0;
		for(int i=1;i<=100;i++){
			int a=0;//计算整除次数
			for(int j=1;j<=i;j++){
				if(i%j==0){
					a++;
				}
			}
			if(a==2){//只能整除1和本身
				System.out.println(i);
				sum+=i;
				num+=1;
			}
		}
		System.out.println("和为："+sum);
		System.out.println("个数为："+num);
	}
	public static void main(String[] args) {
		Work_001.getSuShu();
	}

}
