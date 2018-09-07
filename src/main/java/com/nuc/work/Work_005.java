package com.nuc.work;

public class Work_005 {
	//求2+22+222+2222+22222+2222+222+22+2的和
	public static void getRes(int n){
		int a=2;
		long sum = 0;
		long res = 0;
		for(int i=0;i<=n-1;i++){
			sum+=a;
			System.out.println(sum);
			if(i!=n-1){
				res = res+sum*2;//一分两半，结果×2
			}else{
				res = res+sum;//中间的那个值直接加
			}
			a=a*10;//2->20+2  22*10+2...
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		getRes(6);
	}

}
