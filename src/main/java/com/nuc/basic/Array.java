package com.nuc.basic;

import java.util.Arrays;

/*
 * ����Ķ��壺  
 *    �ȶ��塢���ٿռ䡢��ֵ��ʹ��
 *    java�����鳤�Ȳ��ɱ�
 *    �����±��0��ʼ
 *  һά���飺
 *       
 *  ��ά���飺 
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
		//һά����Ķ��壺
		//(1)
		String[] items0 = null;//�ȶ���
		items0 = new String[3];//���ٿռ�
		items0[0]="song";//��ֵ
		items0[1]="jiang";
		items0[2]="tao";
		
		//ѭ������
		for(int i=0;i<items0.length;i++){
			System.out.println(items0[i]);
		}
		
		//(2)
		String[] items1 = new String[3];
		//(3)
		String[] items2 = {"s","j","t"}; 
		//(4)
		String[] items3 = new String[]{"ss","jj","tt"};
		printArrays(new String[]{"JONES","SMITH","XIAOMING","SMI"});//ע�⣺ֱ�Ӵ�{"JONES","SMITH","XIAOMING","SMI"}�����		
		
		//��ν�������������λ��Ԫ�ص�ֵ
		int a = 10;
		int b = 20;
		int c = 0;
		c=a;
		a=b;
		b=c;
		
		//��ν�����������ֵ�������Ҳ�ͨ������������
		int aa=10;
		int bb=20;
		aa=aa+bb;//aa:30  bb:20
		bb=aa-bb;//aa:30 bb:10
		aa=aa-bb;//aa:20  bb:10	 
		
		//��ά����Ķ���
		String[][] items4 = new String[2][2];
		//items[0]={"","",""};�����
		// items[0]=new String[4];��
		items4[0][0] = "s";
		items4[0][1] = "j";
		items4[1][0] = "t";
		items4[1][1] = "ss";
		
		//Ƕ��ѭ��������ά����
		for(int i=0;i<items4.length;i++){
			for(int j=0;j<items4[i].length;j++){
				System.out.println(items4[i][j]);
			}
		}
		
		//���鸴��
		String items[]={"10","20","99","88","11"};
		String destItems[]={"cc","dd","ss"};
		//�����������ң����ĸ������У����ĸ�λ�ÿ�ʼ��ֵ�����Ƶ��ĸ������У����ģ����Ƽ���
		System.arraycopy(items, 3, destItems, 2, 1);
		System.out.println(Arrays.toString(destItems));
		
		String[] res = Arrays.copyOf(items, 5);
		Arrays.sort(res);//����
		for(String i:res){
			System.out.println(i);
		}
	}
}
