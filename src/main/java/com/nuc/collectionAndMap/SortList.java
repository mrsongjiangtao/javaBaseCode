package com.nuc.collectionAndMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/*
 * List中对象排序，也需要将对象实现Compareable接口重写compareTo方法
 * 必须调用Collections中sort方法；
 * */
public class SortList {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();
		Customer c_0=new Customer("A", 12, "123");
		Customer c_1=new Customer("B", 22, "124");
		Customer c_2=new Customer("C", 32, "125");
		Customer c_3=new Customer("D", 42, "126");
		Customer c_4=new Customer("E", 52, "127");
		Customer c_5=new Customer("F", 62, "128");
		list.add(c_5);
		list.add(c_4);
		list.add(c_3);
		list.add(c_2);
		list.add(c_1);
		list.add(c_0);
		
		Collections.sort(list);
		
		Iterator<Customer> ite = list.iterator();
		while(ite.hasNext()){
			Customer c =ite.next();
			System.out.println(c.getAge()+":"+c.getCardno()+":"+c.getCusName());
		}

	}

}
