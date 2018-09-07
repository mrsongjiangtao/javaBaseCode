package com.nuc.collectionAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 *   Map�ӿڲ���Cllection���ӽӿڣ�
       Mapʵ�֣�key value ��ֵ����ʽ�洢����
          HashTable:��ֵ�Բ���Ϊ�գ��̰߳�ȫ��Ч�ʵ�
          HashMap:��ֵ�Կ���Ϊ�գ��̲߳���ȫ��Ч�ʸ�
 *      //�ж��Ƿ����ĳ��key
 		 //boolean containsKey(Object key) 
 		 put(key,value)������ݣ� get(key)��ȡԪ��
 * */
public class MapClass {

	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("stuno", 100);
		map.put("name", "SJT");
		map.put("age", 22);
		map.put(null, null);
		
		//mapЧ����ߵı�����ʽ
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
		
		//�ж��Ƿ����ĳ��key
		System.out.println("��p2�Ƿ���ڣ�"+m.containsKey(p2));
	}

}
