package com.nuc.work;

public class Work_010 {
	//ȥ��ָ���ַ������ظ����ַ�������ظ�ֻ����һ��
	public static void delRepeat(String str){
		//˼·���Ѹ������ַ�����һ���ó�����ƴ�ӵ�һ�����ַ�����Ȼ����ԭ�ַ����滻����ַ����Դ�����
		String res = "";//���յ����ظ����ַ���
		if(str!=null&&!str.equals("")){
			while(true){
				if(str.length()==0){
					break;
				}
				char c = str.charAt(0);
				res+=c;
				//�滻ԭ���ַ����ó������ַ����滻Ϊ""
				String strNew = str.replace(String.valueOf(c), "");
				str = strNew;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		delRepeat("abcdeabedcdaceb");
	}

}
