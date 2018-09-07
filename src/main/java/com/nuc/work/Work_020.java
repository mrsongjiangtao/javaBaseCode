package com.nuc.work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Work_020 {
	//认识递归
	//1-10阶乘和，非递归版
	public static long getJieChengSum(int n){
		long res = 0;
		int j = 1;
		for(int i=1;i<=n;i++){
			j=i*j;
			res += j;
		}
		return res;
	}
	
	//某个数的阶乘，递归版
	public static long getJieChengDG(int n){
		long res = 0;
		if(n==1){
			return 1;
		}else{
			res = n*getJieChengDG(n-1);
		}
		return res;
	}
	//1-10阶乘和，非递归版
	public static long getJieChengSumDG(int n){
		long res = 0;
		for(int i=1;i<=n;i++){
			res+=getJieChengDG(i);
		}
		return res;
	}
	public static List<String> getAllFile(List<String> res,File filePath) {//递归扫描任意一个文件夹以及子文件夹中的所有文件列表
		if(filePath!=null&&filePath.exists()){
			File[] files = filePath.listFiles();
			if(files!=null){
				for(File f:files){
					if(f.isDirectory()){
						getAllFile(res,f);
					}else{
						res.add(f.getPath());
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(getJieChengSum(10));
		System.out.println(getJieChengDG(3));
		System.out.println(getJieChengSumDG(10));
		List<String> res = new ArrayList<String>();
		List<String> list = getAllFile(res,new File("D:\\eclipse\\code\\IsoftEducation\\Basic\\src\\com\\nuc"));
		for(String s:list){
			System.out.println(s);
		}
	}

}
