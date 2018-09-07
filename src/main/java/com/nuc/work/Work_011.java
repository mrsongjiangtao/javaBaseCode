package com.nuc.work;

import java.util.Arrays;

public class Work_011 {
	//任意交换数组中两个位置元素
	public static void exchangePosition(Object[] arr,int a,int b){//arr为要交换的数组，a,b为要交换的元素的下标
		Object temp;
		if(a>=0&&a<arr.length&&b>=0&&b<arr.length){
			temp = arr[b];
			arr[b] = arr[a];
			arr[a] = temp;
		}else{
			System.out.println("数据有误！不交换");
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		String[] arr = {"s","j","t"};
		exchangePosition(arr,0,1);
	}

}
