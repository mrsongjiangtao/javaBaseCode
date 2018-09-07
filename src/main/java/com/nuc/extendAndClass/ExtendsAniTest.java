package com.nuc.extendAndClass;

public class ExtendsAniTest {
	//父类对象指向子类对象用法，一般用于方法定义，参数是父类对象，可以传多种子类对象
	public static void print(Animal animal){
		System.out.println(animal.getColor()+":"+animal.getHealth()+":"+animal.getName());
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setColor("白色");
		dog.setHealth("100");
		dog.setName("Lucky");
		
		Panda panda=new Panda();
		panda.setColor("白加黑");
		panda.setFood("竹子");
		panda.setHealth("100");
		panda.setName("圆圆");
		
		//对象的上转型对象：子类对象的引用放到父类对象中
		Animal a = new Dog();
		/*
		 * (1)上转型对象不能操作子类新增的成员变量（失掉了这部分属性），不能调用子类新增的方法（失掉了一些行为）。
		 * (2)上转型对象可以访问子类继承和隐藏的成员变量，也可以调用子类继承的方法或子类重写的方法。
		 * 	     上转型对象操作子类继承的方法或子类重写的实例方法，其作用等价于子类对象去调用这些方法
		 * 	     因此，如果子类重写了父类的某个实例方法后，当对象的上转型调用这个实例方法时一定是调用了子类重写的实例方法。
		 */
	}

}
