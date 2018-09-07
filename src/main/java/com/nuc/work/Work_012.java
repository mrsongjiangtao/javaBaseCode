package com.nuc.work;

public class Work_012 {
	//如何高效的找出两个数组中都出现过的字符？
	
	//去重
	public char[] charsNoRepeat(char[] items){
		String str = new String(items);
		String res = "";
		while(true){
			if(str.length()==0){
				break;
			}
			char i = str.charAt(0);
			res = res+i;
			str = str.replace(""+i, "");
		}
		return res.toCharArray();
	}
	
	//查找都存在的字符，返回新数组
	public char[] repeatChar(char[] items,char[] items2){
		char[] res = null;
		String str ="";
		char[] items_r = charsNoRepeat(items);
		char[] items2_r = charsNoRepeat(items2);
		for(int i=0;i<items_r.length;i++){
			for(int j=0;i<items2_r.length;j++){
				if(items_r[i]==items2_r[j]){
					str=str+items_r[i];
					break;
				}
			}
		}
		res = str.toCharArray();
		return res;
	}
	public static void main(String[] args) {
		Work_012 e = new Work_012();
		char[] items0={'a','b','c','d','a','b','c','d','a','b','c','d','d'};
		char[] items1={'a','b','c','d','a','b','c','f','d','b','c','f','d','b','c','f','d'};
		char[] res=e.repeatChar(items0, items1);
		if(res!=null){
			for(char j:res){//增强for循环
		    	System.out.println(j);
		    }
		}
	}

}
