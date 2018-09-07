package com.nuc.extendAndClass;

public class StudentTest {

	public static void main(String[] args) {
		//类是一类事物，程序中是class。是一个模板
		
		//创建对象
		Student stu = new Student();
		//调用set方法
		stu.setStuName("张三");
		stu.setAge(23);
		stu.setAddress("太原");
		stu.study("高数");//调用study方法
		//调用get方法
		System.out.println(stu.getStuName()+"--"+stu.getAge()+"--"+stu.getAddress());
		stu.print();//调用print方法
		
		Student stu1 = new Student();
		stu1.setStuName("李四");
		stu1.setAge(24);
		stu1.setAddress("北京");
		
		System.out.println(stu==stu1);
		System.out.println(stu.equals(stu1));
	}

}
