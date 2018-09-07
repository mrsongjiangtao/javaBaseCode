package com.nuc.collectionAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Collection->List ����ļ���
 *    LinkedList:����ʵ�֣����룬ɾ��Ч�ʸߣ���ѯЧ�ʵͣ��̲߳���ȫ
 *    ArrayList:����ʵ��,��ѯЧ�ʸߣ� ���룬ɾ��Ԫ�أ�Ч�ʵͣ��̲߳���ȫ
 *    Vector:����ʵ�֣��̰߳�ȫ
 *    ���÷�����add(����)���Ԫ�أ�get(�±�)Ĭ�ϴ�0��ʼ����ȡԪ��
 *           remove(int index) remove(Object obj) �����±����Ԫ���Ƴ�ĳһ������
 *           addAll(Collection cl)��ĳ��������Ԫ�أ��ϲ�����ǰ������
 *           size()�ü��ϳ��� contains(Object obj)�ж�ĳ��Ԫ���ڸü������Ƿ����
 *           toArray()�����תΪ����
 *           ��ν�����תΪList���ϣ�
 *           Arrays.asList(objct ...a)
 * */
public class ListClass {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add("JONES");
		List list2 = new LinkedList();
		list2.add(11);
		list2.add("SJT");
		for(int i=0;i<list.size();i++){//ArrayList,��ɾЧ�ʵͣ���Ч�ʸ�
			System.out.println("ArrayList��"+list.get(i));//ͨ��get������ȡ���ݣ�����ΪС��
		}
		for(int j=0;j<list2.size();j++){//LinkedList,��ɾЧ�ʸߣ���Ч�ʵ�
			System.out.println("LinkedList��"+list2.get(j));
		}
		list.remove(0);
		for(int i=0;i<list.size();i++){//ArrayList,��ɾЧ�ʵͣ���Ч�ʸ�
			System.out.println("remove�Ժ��ArrayList��"+list.get(i));//ͨ��get������ȡ���ݣ�����Ϊ�±�
		}
		list.addAll(list2);
		for(int i=0;i<list.size();i++){//ArrayList,��ɾЧ�ʵͣ���Ч�ʸ�
			System.out.println("addAll�Ժ��ArrayList��"+list.get(i));//ͨ��get������ȡ���ݣ�����Ϊ�±�
		}
		list.clear();
		
		if(list.size()!=0){
			for(int i=0;list.size()!=0;i++){
				System.out.println(list.get(i));
			}
		}else{
			System.out.println("Ԫ��Ϊ��");
		}
		//�ж�JONES�Ƿ����
		System.out.println("list��JONES�Ƿ���ڣ�"+list.contains("JONES"));
		System.out.println("list2��SJT�Ƿ���ڣ�"+list2.contains("SJT"));
		
		//����ת����
		Object[] obj = list2.toArray();
		System.out.println("listת���飺"+Arrays.toString(obj));
		
		//����ת����
		String[] arr = {"s","j","t"};
		List<String> listArr = Arrays.asList(arr);
		for(String s:listArr){
			System.out.println("����תlist:"+s);
		}
	}

}
