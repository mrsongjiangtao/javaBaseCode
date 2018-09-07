package com.nuc.collectionAndMap;

import java.util.HashMap;
import java.util.Map;

/*
 * Map��key�����һ���Զ���������
 * ĳ����������ͬ��ʱ��Ϊ��ͬһ��key���������   
 * 
 * Map����key�Ƿ���ͬ������Ҫ��equals����������Ҫ��hashcodeֵ
 * ���߶����㣬��ʱ����Ϊͬһ��key
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
