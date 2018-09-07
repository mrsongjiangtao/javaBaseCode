package com.nuc.collectionAndMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCus {

	public static void main(String[] args) {
		Set<Customer> set=new HashSet<Customer>();
		Customer c_0=new Customer("JOENS", 12, "223232311");
		Customer c_1=new Customer("SMITH", 22, "123232312");
		Customer c_2=new Customer("ZYG", 22, "223232313");
		Customer c_3=new Customer("SDA", 22, "123232314");
		Customer c_4=new Customer("XIAOMING", 22, "223232315");
		Customer c_5=new Customer("DIOAF", 20, "123232317");
		set.add(c_5);
		set.add(c_4);
		set.add(c_3);
		set.add(c_2);
		set.add(c_1);
		set.add(c_0);
	  
		Iterator<Customer> ite=set.iterator();
		while(ite.hasNext()){
			Customer c=ite.next();
			System.out.println(c.getAge()+":"+c.getCardno()+":"+c.getCusName());
		}
	}

}
