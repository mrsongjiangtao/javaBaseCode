package com.nuc.basic;

import java.util.Arrays;

/*
 * String 是一种引用数据类型；
 * 不可变长度字符串,不可被继承
 * 字符串下标从0开始
 * 字符串下标越界：java.lang.StringIndexOutOfBoundsException:
 * */
public class StringMethod {
	public static String str1;//整型默认0 浮点默认0.0 引用数据类型默认null boolean类型false
	public static String str2 = null;
	public static String str3 = "SongJiangTao";
	public static String str4 = new String("Song");
	
	public static void main(String[] args) {
		System.out.println(str1);//空，不等同 '' "" 空格
		str3 = str3+"AA";//字符串拼接
		System.out.println("拼接结果为："+str3);
		
		//常用方法
		//(1) char charAt(int index) 返回指定索引处的 char值。 
		char c1 = str3.charAt(2);//下标从0开始
    	System.out.println("第三个位置字符为："+c1);
    	
    	//(2) int compareTo(String anotherString) 按字典顺序比较两个字符串。  >正数 <负数  0 等于
        int a = "abc".compareTo("abf");//依次比较字符大小，相等返回0,前者小于后者返回负数（其绝对值表示相差的多少），大于返回正数（大小也是差多少）
        System.out.println("比较两个字符串大小："+a);

        //（3）String concat(String str)连接两个字符串，形成一个新字符串
        System.out.println("字符串已经改变：concat结果："+str3.concat("AAA"));
        
        //(4)boolean endsWith(String suffix) 判断字符串是否以谁结尾  boolean startsWith(String suffix)  以谁开头
        //这两个方法区分大小写
        System.out.println("Song以ong结尾？"+str4.endsWith("ong"));
        System.out.println("Song以Son开头？"+str4.startsWith("Son"));
        
        //(5) boolean equalsIgnoreCase(String anotherString)  忽略大小写比较
        System.out.println("song和Song忽略大小写比较结果？"+"song".equalsIgnoreCase(str4));
        
        //(6)int indexOf(String ch)找某个子字符串，在该字符串中第一次出现的位置，没有则返回-1
        System.out.println(str4.indexOf("g"));
        System.out.println("abccba中a最后一次出现的位置"+"abccba".lastIndexOf("a"));//找某个子字符串，在该字符串中最后一次出现的位置，没有则返回-1
        
        //(8) int length() 求字符串长度
        System.out.println("str4的长度："+str4.length());
        
        //(9)替换字符串 String replace(char/String oldChar, char/String newChar) 
        System.out.println("AABB将B替换为A？"+"AABB".replace('B', 'A'));
        
        //(10)截取字符串， String substring(int beginIndex) 
        System.out.println("str3截取前五个字符="+str3.substring(0,4));
        
        //(11)大小写转换 String toLowerCase()   String toUpperCase（）
        System.out.println(str4.toLowerCase());//小写
        System.out.println(str3.toUpperCase());//转成大写
        System.out.println(str3);//没有赋值，所以不变
        
        //(12)去掉两边空格
        System.out.println("   sdfdsf   去掉空白？"+"   sdfdsf   ".trim());
      
        //(13)将基本数据类型转为字符串static String valueOf(int/char[]/char.... b) 
        System.out.println(String.valueOf(11));
        
        //(14)toCharArray,字符串转字符数组
        char[] charArr = "sjt".toCharArray();
        System.out.println(Arrays.toString(charArr));
        
        //(15)new String(char[] items)，字符数组转字符串
        char[] charArr2 = {'a','b','c'};
        String str5 = new String(charArr2);
        System.out.println(str5);
        
        //(16)split("")
        String[] strArr = "a:b:c:d".split(":");
        System.out.println(Arrays.toString(strArr));
	}

}
