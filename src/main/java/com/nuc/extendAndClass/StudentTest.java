package com.nuc.extendAndClass;

public class StudentTest {

	public static void main(String[] args) {
		//����һ�������������class����һ��ģ��
		
		//��������
		Student stu = new Student();
		//����set����
		stu.setStuName("����");
		stu.setAge(23);
		stu.setAddress("̫ԭ");
		stu.study("����");//����study����
		//����get����
		System.out.println(stu.getStuName()+"--"+stu.getAge()+"--"+stu.getAddress());
		stu.print();//����print����
		
		Student stu1 = new Student();
		stu1.setStuName("����");
		stu1.setAge(24);
		stu1.setAddress("����");
		
		System.out.println(stu==stu1);
		System.out.println(stu.equals(stu1));
	}

}
