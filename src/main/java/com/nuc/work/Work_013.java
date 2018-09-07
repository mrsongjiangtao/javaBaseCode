package com.nuc.work;

import java.util.Arrays;

public class Work_013 {
	/*
	 * 一个数组 a,需要将里面的每个元素循环移位n
	 * 例如：Object[] items=new Object[]{0,1,2,3,4}
	 * 循环移位2后变为{3,4,0,1,2}
	 */
	
	//方法1
	public static void getRes(byte[] array,int k){//array表示数组，k表示循环位移几位
		if(array!=null&&array.length>0&&k!=array.length&&k>0){
			int length = array.length;
			// 右移newk + n * length个位置，和右移newk个位置效果是一样的
			int newk = k % length;
			byte temp = 0;
			for(int i = 0; i < newk; i++) {
				temp = array[length - 1];
				for(int j = length - 2; j >= 0; j--) {
					array[j+1]=array[j];
				}
				array[0]=temp;
			}
			System.out.println(Arrays.toString(array));

		}else{
			System.out.println("数据有误");
		}	
	}
	
	//方法2
	public static int[] moveArrayElement(int[] array, int k) {
		int length = array.length;
		// 右移newk + n * length个位置，和右移newk个位置效果是一样的
		int newk = k % length;
		int[] newArray = new int[length];
		// 重复length次把元素从旧位置移到新位置
		for(int i = 0; i < length; i++) {
			// 求出元素新的位置
			int newPosition = (i + newk) % length;
			newArray[newPosition] = array[i];
		}
		return newArray;
	}
	
	//方法3
	public static void moveArrayElement2(int[] array, int k) {//3次倒置，整体倒置，分开两部分倒置
		// 倒置所有元素
		reverse(array);
		// 倒置前k个元素
		reverse(array, 0, k - 1);
		// 倒置后length - k个元素
		reverse(array, k, array.length - 1);
		System.out.println(Arrays.toString(array));
	}

	private static void reverse(int[] array, int begin, int end) {
		int length = end - begin + 1;
		int half = length / 2;
		for(int i = 0; i < half; i++) {
			int temp = array[begin];
			array[begin] = array[end];
			array[end] = temp;
			begin++;
			end--;
		}
	}
	private static void reverse(int[] array) {
		reverse(array, 0, array.length - 1);
	}


	public static void main(String[] args) {
		byte[] items={0,1,2,3,4};
		getRes(items,2);
		
		int[] a = {1,2,3,4,5};
		int[] b;
		b = moveArrayElement(a,2);
		for(int i:b){
			System.out.println(i);
		}
		
		moveArrayElement2(a,2);
		
	}

}
