package com.nuc.work;

public class Work_004 {
	//求1-1000之间的数，要求自身因子和为本身，例如：6=1＋2＋3
	public static void getRes(){
		for(int i=1;i<=1000;i++){
			int sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		getRes();
	}

}
