package com.nuc.work;

public class Work_010 {
	//去掉指定字符串中重复的字符，如果重复只保留一个
	public static void delRepeat(String str){
		//思路：把给定的字符串第一个拿出来，拼接到一个空字符串，然后再原字符串替换这个字符！以此类推
		String res = "";//最终的无重复的字符串
		if(str!=null&&!str.equals("")){
			while(true){
				if(str.length()==0){
					break;
				}
				char c = str.charAt(0);
				res+=c;
				//替换原来字符串拿出来的字符，替换为""
				String strNew = str.replace(String.valueOf(c), "");
				str = strNew;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		delRepeat("abcdeabedcdaceb");
	}

}
