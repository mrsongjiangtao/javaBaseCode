package com.nuc.basic;

import java.util.Arrays;

/*
 * String ��һ�������������ͣ�
 * ���ɱ䳤���ַ���,���ɱ��̳�
 * �ַ����±��0��ʼ
 * �ַ����±�Խ�磺java.lang.StringIndexOutOfBoundsException:
 * */
public class StringMethod {
	public static String str1;//����Ĭ��0 ����Ĭ��0.0 ������������Ĭ��null boolean����false
	public static String str2 = null;
	public static String str3 = "SongJiangTao";
	public static String str4 = new String("Song");
	
	public static void main(String[] args) {
		System.out.println(str1);//�գ�����ͬ '' "" �ո�
		str3 = str3+"AA";//�ַ���ƴ��
		System.out.println("ƴ�ӽ��Ϊ��"+str3);
		
		//���÷���
		//(1) char charAt(int index) ����ָ���������� charֵ�� 
		char c1 = str3.charAt(2);//�±��0��ʼ
    	System.out.println("������λ���ַ�Ϊ��"+c1);
    	
    	//(2) int compareTo(String anotherString) ���ֵ�˳��Ƚ������ַ�����  >���� <����  0 ����
        int a = "abc".compareTo("abf");//���αȽ��ַ���С����ȷ���0,ǰ��С�ں��߷��ظ����������ֵ��ʾ���Ķ��٣������ڷ�����������СҲ�ǲ���٣�
        System.out.println("�Ƚ������ַ�����С��"+a);

        //��3��String concat(String str)���������ַ������γ�һ�����ַ���
        System.out.println("�ַ����Ѿ��ı䣺concat�����"+str3.concat("AAA"));
        
        //(4)boolean endsWith(String suffix) �ж��ַ����Ƿ���˭��β  boolean startsWith(String suffix)  ��˭��ͷ
        //�������������ִ�Сд
        System.out.println("Song��ong��β��"+str4.endsWith("ong"));
        System.out.println("Song��Son��ͷ��"+str4.startsWith("Son"));
        
        //(5) boolean equalsIgnoreCase(String anotherString)  ���Դ�Сд�Ƚ�
        System.out.println("song��Song���Դ�Сд�ȽϽ����"+"song".equalsIgnoreCase(str4));
        
        //(6)int indexOf(String ch)��ĳ�����ַ������ڸ��ַ����е�һ�γ��ֵ�λ�ã�û���򷵻�-1
        System.out.println(str4.indexOf("g"));
        System.out.println("abccba��a���һ�γ��ֵ�λ��"+"abccba".lastIndexOf("a"));//��ĳ�����ַ������ڸ��ַ��������һ�γ��ֵ�λ�ã�û���򷵻�-1
        
        //(8) int length() ���ַ�������
        System.out.println("str4�ĳ��ȣ�"+str4.length());
        
        //(9)�滻�ַ��� String replace(char/String oldChar, char/String newChar) 
        System.out.println("AABB��B�滻ΪA��"+"AABB".replace('B', 'A'));
        
        //(10)��ȡ�ַ����� String substring(int beginIndex) 
        System.out.println("str3��ȡǰ����ַ�="+str3.substring(0,4));
        
        //(11)��Сдת�� String toLowerCase()   String toUpperCase����
        System.out.println(str4.toLowerCase());//Сд
        System.out.println(str3.toUpperCase());//ת�ɴ�д
        System.out.println(str3);//û�и�ֵ�����Բ���
        
        //(12)ȥ�����߿ո�
        System.out.println("   sdfdsf   ȥ���հף�"+"   sdfdsf   ".trim());
      
        //(13)��������������תΪ�ַ���static String valueOf(int/char[]/char.... b) 
        System.out.println(String.valueOf(11));
        
        //(14)toCharArray,�ַ���ת�ַ�����
        char[] charArr = "sjt".toCharArray();
        System.out.println(Arrays.toString(charArr));
        
        //(15)new String(char[] items)���ַ�����ת�ַ���
        char[] charArr2 = {'a','b','c'};
        String str5 = new String(charArr2);
        System.out.println(str5);
        
        //(16)split("")
        String[] strArr = "a:b:c:d".split(":");
        System.out.println(Arrays.toString(strArr));
	}

}
