package com.nuc.work;

public class Work_009 {
	//дһ��������ʵ�ֲ���ָ�����ַ������ֵĴ�����
	public static void strTotal(String str,String childStr){
		int total = 0;//����
		int index = 0;//��ʼ���ҵ��±��0��ʼ
		if(str!=null&&childStr!=null){
			while(true){
				int next = str.indexOf(childStr,index);
				if(next!=-1){//����
					total++;
					//��ʼ����һ���ҵ���λ�ã����¸�ֵ��index������һ�β��ҵĿ�ʼλ��
			    	index = next+childStr.length();
				}else{
					break;
				}
			}
			System.out.println(total);
		}
	}
	public static void main(String[] args) {
		strTotal("songjiangtaosongjiangtao","tao");
	}

}
