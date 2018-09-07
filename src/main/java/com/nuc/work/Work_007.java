package com.nuc.work;

public class Work_007 {
	//2/1+3/2+5/3+8/5+13/8+21/13的和
	public static void getRes(int n){
		double fenzi =2.0;
		double fenmu =1.0;
		double res =0.0;
		double mid ;//中间值
		for(int i=1;i<=n+1;i++){
			res+=fenzi/fenmu;
			mid = fenzi;
			fenzi =fenzi+fenmu;
			fenmu = mid;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		getRes(6);//式子中有6项求和
	}
}
