package com.nuc.extendAndClass;

public class ExtendsAniTest {
	//�������ָ����������÷���һ�����ڷ������壬�����Ǹ�����󣬿��Դ������������
	public static void print(Animal animal){
		System.out.println(animal.getColor()+":"+animal.getHealth()+":"+animal.getName());
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setColor("��ɫ");
		dog.setHealth("100");
		dog.setName("Lucky");
		
		Panda panda=new Panda();
		panda.setColor("�׼Ӻ�");
		panda.setFood("����");
		panda.setHealth("100");
		panda.setName("ԲԲ");
		
		//�������ת�Ͷ��������������÷ŵ����������
		Animal a = new Dog();
		/*
		 * (1)��ת�Ͷ����ܲ������������ĳ�Ա������ʧ�����ⲿ�����ԣ������ܵ������������ķ�����ʧ����һЩ��Ϊ����
		 * (2)��ת�Ͷ�����Է�������̳к����صĳ�Ա������Ҳ���Ե�������̳еķ�����������д�ķ�����
		 * 	     ��ת�Ͷ����������̳еķ�����������д��ʵ�������������õȼ����������ȥ������Щ����
		 * 	     ��ˣ����������д�˸����ĳ��ʵ�������󣬵��������ת�͵������ʵ������ʱһ���ǵ�����������д��ʵ��������
		 */
	}

}
