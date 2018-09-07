package com.nuc.work;

import java.util.Arrays;

public class Work_013 {
	/*
	 * һ������ a,��Ҫ�������ÿ��Ԫ��ѭ����λn
	 * ���磺Object[] items=new Object[]{0,1,2,3,4}
	 * ѭ����λ2���Ϊ{3,4,0,1,2}
	 */
	
	//����1
	public static void getRes(byte[] array,int k){//array��ʾ���飬k��ʾѭ��λ�Ƽ�λ
		if(array!=null&&array.length>0&&k!=array.length&&k>0){
			int length = array.length;
			// ����newk + n * length��λ�ã�������newk��λ��Ч����һ����
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
			System.out.println("��������");
		}	
	}
	
	//����2
	public static int[] moveArrayElement(int[] array, int k) {
		int length = array.length;
		// ����newk + n * length��λ�ã�������newk��λ��Ч����һ����
		int newk = k % length;
		int[] newArray = new int[length];
		// �ظ�length�ΰ�Ԫ�شӾ�λ���Ƶ���λ��
		for(int i = 0; i < length; i++) {
			// ���Ԫ���µ�λ��
			int newPosition = (i + newk) % length;
			newArray[newPosition] = array[i];
		}
		return newArray;
	}
	
	//����3
	public static void moveArrayElement2(int[] array, int k) {//3�ε��ã����嵹�ã��ֿ������ֵ���
		// ��������Ԫ��
		reverse(array);
		// ����ǰk��Ԫ��
		reverse(array, 0, k - 1);
		// ���ú�length - k��Ԫ��
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
