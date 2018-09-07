package com.nuc.work;

public class Work_006 {
	//求1-4任意3组合成不重复的三位数
	public static void getRes(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&i!=k&&j!=k){
						System.out.println(100*i+10*j+k);
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		getRes();
	}

}
