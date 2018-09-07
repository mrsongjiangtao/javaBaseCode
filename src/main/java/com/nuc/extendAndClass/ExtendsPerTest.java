package com.nuc.extendAndClass;

public class ExtendsPerTest {

	public static void main(String[] args) {
		Teacher t = new Teacher("11","张仨","29");
		t.read();
		t.teach();
		
		Emp e = new Emp("40","李四","32");
		e.read();//调用自己重写的方法
		//父类对象=new 子类  此时如果方法被重写，则执行的是子类中的方法；因为父类对象指向了子类引用；
		//对象的上转型对象，子类对象的引用放到父类对象中
		Person p = new Emp("22","王五","33");
		p.read();//父类对象调用子类重写的方法
		
		//instanceof判断某个变量，指向的是谁，是谁的引用
		System.out.println(p instanceof Emp);
	}

}
