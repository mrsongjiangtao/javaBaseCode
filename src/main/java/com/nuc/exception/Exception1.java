package com.nuc.exception;

public class Exception1 {
	public void test2()throws Exception{
		System.out.println("����");
	}
	//throws ��������ʱʹ�ã���ʾ�÷������ܲ������쳣���׳����ɵ��÷����в�����
	public static void main(String[] args) throws Exception{
		//try�еĴ����ǣ���Ҫ�����쳣�Ĵ���Σ����ܲ���ĳЩ�쳣�Ĵ���Σ�
		try{
			System.out.println("��ʼ��");
			String str = null;
			int i = str.length();
			int j = 1/0;
			System.out.println("over!");
		}catch(ArithmeticException e){
			//��catch�д������쳣
			e.printStackTrace();//��ʾ�쳣��Ϣ
			System.out.println(e.getMessage());
		}catch(NullPointerException e2){
			e2.printStackTrace();
			System.out.println(e2.getMessage());
			throw new Exception();//�׳�һ�������쳣��˭���ø÷�����˭������
		}finally{//����ʡ�Բ�д�������Ƿ���û���쳣����ִ�еĴ����
			System.out.println("����ʡ�Բ�д�������Ƿ���û���쳣����ִ�еĴ����");
		}
		//����ִ��
		String str1 = "JONES";
		str1 = str1.substring(0,3);//����ҿ�
		System.out.println(str1);
	}
}
