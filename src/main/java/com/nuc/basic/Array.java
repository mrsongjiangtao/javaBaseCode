package com.nuc.basic;

import java.util.Arrays;

/*
 * 数组的定义：  
 *    先定义、开辟空间、赋值在使用
 *    java中数组长度不可变
 *    数组下标从0开始
 *  一维数组：
 *       
 *  二维数组： 
 * */
public class Array {
	public static void printArrays(String[] items){
		if(items!=null){
			for(int i=0;i<items.length;i++){
				System.out.println(items[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		//一维数组的定义：
		//(1)
		String[] items0 = null;//先定义
		items0 = new String[3];//开辟空间
		items0[0]="song";//赋值
		items0[1]="jiang";
		items0[2]="tao";
		
		//循环遍历
		for(int i=0;i<items0.length;i++){
			System.out.println(items0[i]);
		}
		
		//(2)
		String[] items1 = new String[3];
		//(3)
		String[] items2 = {"s","j","t"}; 
		//(4)
		String[] items3 = new String[]{"ss","jj","tt"};
		printArrays(new String[]{"JONES","SMITH","XIAOMING","SMI"});//注意：直接传{"JONES","SMITH","XIAOMING","SMI"}则错误		
		
		//如何交换数组中两个位置元素的值
		int a = 10;
		int b = 20;
		int c = 0;
		c=a;
		a=b;
		b=c;
		
		//如何将两个变量的值交换，且不通过第三个变量
		int aa=10;
		int bb=20;
		aa=aa+bb;//aa:30  bb:20
		bb=aa-bb;//aa:30 bb:10
		aa=aa-bb;//aa:20  bb:10	 
		
		//二维数组的定义
		String[][] items4 = new String[2][2];
		//items[0]={"","",""};错误的
		// items[0]=new String[4];对
		items4[0][0] = "s";
		items4[0][1] = "j";
		items4[1][0] = "t";
		items4[1][1] = "ss";
		
		//嵌套循环遍历二维数组
		for(int i=0;i<items4.length;i++){
			for(int j=0;j<items4[i].length;j++){
				System.out.println(items4[i][j]);
			}
		}
		
		//数组复制
		String items[]={"10","20","99","88","11"};
		String destItems[]={"cc","dd","ss"};
		//参数从左往右：从哪个数组中，从哪个位置开始赋值，复制到哪个数组中，从哪，复制几个
		System.arraycopy(items, 3, destItems, 2, 1);
		System.out.println(Arrays.toString(destItems));
		
		String[] res = Arrays.copyOf(items, 5);
		Arrays.sort(res);//排序
		for(String i:res){
			System.out.println(i);
		}
	}
}
