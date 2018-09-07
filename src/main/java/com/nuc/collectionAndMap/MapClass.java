package com.nuc.collectionAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *   Map接口不是Cllection的子接口：
       Map实现：key value 键值对形式存储数据
          HashTable:键值对不能为空，线程安全，效率低
          HashMap:键值对可以为空，线程不安全，效率高
 *      //判断是否存在某个key
 		 //boolean containsKey(Object key) 
 		 put(key,value)存放数据， get(key)获取元素
 * */
public class MapClass {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("stuno", 100);
		map.put("name", "SJT");
		map.put("age", 22);
		map.put(null, null);
		
		//map效率最高的遍历方式
		Set<Map.Entry<String,Object>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Object>> ite = entrySet.iterator();
		while(ite.hasNext()){
			Map.Entry<String, Object> obj = ite.next();
			String key = obj.getKey();
			Object value = obj.getValue();
			System.out.println(key+":"+value);
		}
		
		Person p1 = new Person();
		Person p2 = new Person();
		p1.setName("SJT");
		p2.setName("SJT2");
		Map<Person, String> m =  new HashMap<Person,String>();
		m.put(p1, "AA");
		m.put(p2, "BB");
		System.out.println(m.get(p1));
		
		//判断是否存在某个key
		System.out.println("键p2是否存在？"+m.containsKey(p2));
	}

}
