package com.nuc.extendAndClass;
/*
 * �ࣺclass ��������һ�����������Ϊ��һ��ģ�壻
 * ��������Զ��󣬼���һ�������е�һ�����壻
 * ����������һ�����������еĶ����� 
 * ���ԣ�����һ�����������е����Ի����ص㣻���������ֵ���ȫ�ֱ�����
 * 
 * ������󣺼�����ĳһ���¼�������Щ���󣬷������ǵĶ��������е������ص㣬ͨ�����ַ�ʽ��������⣻
 * ��������̣�
 * ���磺���� ����
 * �������Ķ������Ϊ�࣬ͨ�����������Խ��������ࣻ
 * ͨ������������ʵ�ֲ�����
 * 
 * ������̣����ص����ڲ��裬ͨ��һ��һ�����ú�����ʵ�ֲ�����
 * ����ȥ��ͨ������ְ��
 * �������Ƕȳ����� ��������  ���� ȥ�Ķ��� ��ʲô��
 * ������̽Ƕȳ���: ȥ�Ķ���  ��ɶ�� 
 * 
 * �����ס��
 * ��������������̣�
 * OOA���������� 
 * OOD����������
 * OOP���������
 * 
 * ���������������(����)
 * �̳С���̬����װ
 * 
 * �������η���public ��ͬ������ͬ�������ɷ���
 *          ��д ֻ����ͬ���¿��Է���
 *          private ֻ�е�ǰ����Է���
 * 
 * this:��ʾ��ǰ����󣬲�������static�����ķ����У����������־ֲ�������ȫ�ֱ���ͬ����
 * 
 * */
public class Student {
	//����
    private  String stuName;//����
    private  String address;
    private  int age;
    
    //void��ʾû�з���ֵ���Ͳ���return
    public void study(String scName){
    	System.out.println("ѧϰ�γ̣�"+scName);
    }
    
    public void print(){
    	System.out.println("������"+stuName+"���䣺"+age+"��ַ��"+address);
    }
    
    //get set ����
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
