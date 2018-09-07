package com.nuc.collectionAndMap;

import java.util.HashMap;
import java.util.Map;

/*
 * Map中key如果是一个自定义的类对象
 * 某几个属性相同此时认为是同一个key，如何做？   
 * 
 * Map区分key是否相同，不仅要看equals方法，还需要看hashcode值
 * 两者都满足，此时才认为同一个key
 * 
 * */
public class EqualsMapKeyTest {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("SMITH");
	    Person p2=new Person();
		p2.setName("SMITH");
		Map<Person,String> m = new HashMap<Person,String>();
		m.put(p1, "AA");
		m.put(p2, "SS");
	
		System.out.println((m.get(p1)).equals(m.get(p2)));
	}

}
