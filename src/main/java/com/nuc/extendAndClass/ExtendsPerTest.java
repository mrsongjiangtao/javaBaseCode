package com.nuc.extendAndClass;

public class ExtendsPerTest {

	public static void main(String[] args) {
		Teacher t = new Teacher("11","����","29");
		t.read();
		t.teach();
		
		Emp e = new Emp("40","����","32");
		e.read();//�����Լ���д�ķ���
		//�������=new ����  ��ʱ�����������д����ִ�е��������еķ�������Ϊ�������ָ�����������ã�
		//�������ת�Ͷ��������������÷ŵ����������
		Person p = new Emp("22","����","33");
		p.read();//����������������д�ķ���
		
		//instanceof�ж�ĳ��������ָ�����˭����˭������
		System.out.println(p instanceof Emp);
	}

}
