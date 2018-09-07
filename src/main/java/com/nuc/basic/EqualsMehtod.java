package com.nuc.basic;
//==  equals方法 比较区别？
//==既比较内容，也比较内存地址是否相同
//equals比较两个对象内容
public class EqualsMehtod {
	
	public static void main(String[] args) {
		//字符串比较，不允许用== ，只能通过equals方法
		//字符串== 和equals比较
		String str1 = "Song";
		String str2 = "Song";
		String str3 = new String("Song");
		
		System.out.println(str1==str2);//true
		System.out.println(str2==str3);//false
		System.out.println(str2.equals(str3));//true
		
		//基本数据类型中以Integer和int为例，==和equals比较
		int i0 = 10;
		int i1 = 10;
		//i0和i1都是int类型，则直接==比较
		System.out.println(i0==i1);//true
		
		int i2 = 10;
		Integer i3 = 10;
		Integer i4=new Integer(10);
		System.out.println(i2==i3);//true
		System.out.println(i3.equals(i2));//true
		
		System.out.println(i4==i2);//true
		System.out.println(i4.equals(i3));//true
		System.out.println(i4==i3);//false，这是两个对象
		
		int i6=new Integer(10);
		Integer i7=10;
		System.out.println(i6==i7);//true
		System.out.println(i7.equals(i6));//true
		
		int i8=new Integer(10);
		int i9=new Integer(10);  
		System.out.println(i8==i9);//true
		
		//127 128 问题
		Integer a = 127;
		Integer b = 127;
		System.out.println(a==b);//true
		//超一个字节会重新分配空间
		Integer c = 128;
		Integer d = 128;
		System.out.println(c==d);//false
		//注意：如果Integer和Integer/int比较具体是否相等，此时绝对不允许使用== 
		String str="10";
		Integer m=10;
		
		System.out.println(m.equals(str));//false
		System.out.println(m.toString().equals(str));//true
		  
		  
	}

}
