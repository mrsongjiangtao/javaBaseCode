package com.nuc.collectionAndMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collection->Set�ӿڲ��������ظ����ݣ�ʹ��HashMapʵ���洢�ģ����洢������Ϊkey��ͨ��equals�����Ƚ��Լ�hashcodeȷ���Ƿ�����ͬ��������ģ�
 *    HashSet
 *    TreeSet:���Ԫ�ؽ�����Ȼ����
 *    
 *    ���÷�����add(E e)���Ԫ�أ� iterator()��ȡ������
 * */
public class SetClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("sjt");
		Set set = new HashSet();
		set.add(1);
		set.add("a");
		set.add(p);
		
		//���������е���
		Iterator ite = set.iterator();//��set���ݷ�������������е���
		while(ite.hasNext()){//��������һ��λ���Ƿ������ݣ�����Ϊtrue
			Object obj = ite.next();
			if(obj instanceof Person){
				Person p1 = (Person)obj;
				System.out.println(p1.getName());
			}else{
				System.out.println(obj);
			}
		}
		System.out.println("-----����Set-----");
		//��ӷ��͵�Set
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.setName("sss");
		p2.setName("jjj");
		p3.setName("ttt");
		Set<Person> set1 = new HashSet<Person>();//���뷺�ͣ���ʱ��setֻ�ܴ�Ż��߲�������ָ��������
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		
		//�Ƴ�ĳһ��Ԫ��
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
