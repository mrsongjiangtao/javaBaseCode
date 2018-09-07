package com.nuc.work;

public class Work_002 {
	//用while、for循环写出1-10阶乘和
	public static void forGetRes(int n){
		long sum=0;
		long r=1;
		for(int i=1;i<=n;i++){
			 r=r*i;
			 sum=sum+r;
		 }
		System.out.println(sum);
	}
	
	public static void whileGetRes(){
		int i = 1;
		long sum = 0;
		long res = 1;
		while(i<=10){
			res=res*i;
			sum+=res;
			i++;	
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		forGetRes(10);
		whileGetRes();
	}

}
