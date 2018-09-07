package com.nuc.collectionAndMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collection->Set接口不允许存放重复数据（使用HashMap实例存储的，将存储对象作为key，通过equals方法比较以及hashcode确定是否是相同），无序的；
 *    HashSet
 *    TreeSet:会对元素进行自然排序
 *    
 *    常用方法：add(E e)添加元素， iterator()获取迭代器
 * */
public class SetClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("sjt");
		Set set = new HashSet();
		set.add(1);
		set.add("a");
		set.add(p);
		
		//迭代器进行迭代
		Iterator ite = set.iterator();//将set数据放入迭代器，进行迭代
		while(ite.hasNext()){//迭代器下一个位置是否有数据，有则为true
			Object obj = ite.next();
			if(obj instanceof Person){
				Person p1 = (Person)obj;
				System.out.println(p1.getName());
			}else{
				System.out.println(obj);
			}
		}
		System.out.println("-----泛型Set-----");
		//添加泛型的Set
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.setName("sss");
		p2.setName("jjj");
		p3.setName("ttt");
		Set<Person> set1 = new HashSet<Person>();//加入泛型，此时该set只能存放或者操作泛型指定的类型
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		
		//移除某一个元素
		set1.remove(p1);
		Iterator<Person> ite1 = set1.iterator();
		while(ite1.hasNext()){
			Person person = ite1.next();
			System.out.println(person.getName());
		}
		
		System.out.println("-----TreeSet-----");
		Set set2 = new TreeSet();
		set2.add(10);
		set2.add(11);
		Iterator ite2 = set2.iterator();
		while(ite2.hasNext()){
			System.out.println((int)(ite2.next()));
		}

	}

}
