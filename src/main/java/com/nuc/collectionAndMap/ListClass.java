package com.nuc.collectionAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * Collection->List 有序的集合
 *    LinkedList:链表实现，插入，删除效率高，查询效率低，线程不安全
 *    ArrayList:数组实现,查询效率高， 插入，删除元素，效率低，线程不安全
 *    Vector:数组实现，线程安全
 *    常用方法：add(对象)添加元素，get(下标)默认从0开始，获取元素
 *           remove(int index) remove(Object obj) 根据下标或者元素移除某一个对象
 *           addAll(Collection cl)将某个集合中元素，合并到当前集合中
 *           size()该集合长度 contains(Object obj)判断某个元素在该集合中是否存在
 *           toArray()将结合转为数组
 *           如何将数组转为List集合？
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
		for(int i=0;i<list.size();i++){//ArrayList,增删效率低，查效率高
			System.out.println("ArrayList："+list.get(i));//通过get方法获取数据，参数为小标
		}
		for(int j=0;j<list2.size();j++){//LinkedList,增删效率高，查效率低
			System.out.println("LinkedList："+list2.get(j));
		}
		list.remove(0);
		for(int i=0;i<list.size();i++){//ArrayList,增删效率低，查效率高
			System.out.println("remove以后的ArrayList："+list.get(i));//通过get方法获取数据，参数为下标
		}
		list.addAll(list2);
		for(int i=0;i<list.size();i++){//ArrayList,增删效率低，查效率高
			System.out.println("addAll以后的ArrayList："+list.get(i));//通过get方法获取数据，参数为下标
		}
		list.clear();
		
		if(list.size()!=0){
			for(int i=0;list.size()!=0;i++){
				System.out.println(list.get(i));
			}
		}else{
			System.out.println("元素为空");
		}
		//判断JONES是否存在
		System.out.println("list中JONES是否存在？"+list.contains("JONES"));
		System.out.println("list2中SJT是否存在？"+list2.contains("SJT"));
		
		//集合转数组
		Object[] obj = list2.toArray();
		System.out.println("list转数组："+Arrays.toString(obj));
		
		//数组转集合
		String[] arr = {"s","j","t"};
		List<String> listArr = Arrays.asList(arr);
		for(String s:listArr){
			System.out.println("数组转list:"+s);
		}
	}

}
