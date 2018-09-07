package com.nuc.work;

public class Work_009 {
	//写一个方法，实现查找指定子字符串出现的次数；
	public static void strTotal(String str,String childStr){
		int total = 0;//计数
		int index = 0;//起始查找的下标从0开始
		if(str!=null&&childStr!=null){
			while(true){
				int next = str.indexOf(childStr,index);
				if(next!=-1){//存在
					total++;
					//开始将上一次找到的位置，重新赋值给index，即下一次查找的开始位置
			    	index = next+childStr.length();
				}else{
					break;
				}
			}
			System.out.println(total);
		}
	}
	public static void main(String[] args) {
		strTotal("songjiangtaosongjiangtao","tao");
	}

}
