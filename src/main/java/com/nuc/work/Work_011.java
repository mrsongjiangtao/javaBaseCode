package com.nuc.work;

import java.util.Arrays;

public class Work_011 {
	//���⽻������������λ��Ԫ��
	public static void exchangePosition(Object[] arr,int a,int b){//arrΪҪ���������飬a,bΪҪ������Ԫ�ص��±�
		Object temp;
		if(a>=0&&a<arr.length&&b>=0&&b<arr.length){
			temp = arr[b];
			arr[b] = arr[a];
			arr[a] = temp;
		}else{
			System.out.println("�������󣡲�����");
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		String[] arr = {"s","j","t"};
		exchangePosition(arr,0,1);
	}

}
