package com.nuc.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//以字节流为单位，将一个字符串写入内存，并输出2
		String str = "宋江sjt";
		InputStream input = new ByteArrayInputStream(str.getBytes());
		BufferedInputStream bufInput = new BufferedInputStream(input);
		//读取流中的数据
		
		byte[] items = new byte[5];
//		while(true){
//			//该方法返回值并不是读取得数据了，而是读取数据的个数， 参数是读取得数据（字节数组）
//			int i = input.read(items);
//			//此时i为读取数据的个数，如果无读取数据，则返回-1
//			if(i==-1){
//				break;
//			}
//			System.out.println("读取数据字节个数为:"+i);
//			String s = new String(items);
//			System.out.println(s);
//		}
		/*
		 * 读取数据字节个数为:5
		       宋江s
		       读取数据字节个数为:2
		   jt江s

		这样结果的原因，字符串共7个字节(2+2+1+1+1);
		第一次满读取！，第二次只读取了，jt，这样就读完了整个字符串，
		上面的只是第一次读取的，第二次字节数组没有覆盖掉数组中，234位置的值！
		 * 
		 */
		int i = 0;//读取字节个数，每次读取数据的个数
		while((i=bufInput.read(items))!=-1){
			String res = new String(items,0,i);
			System.out.println(res);
		}
		bufInput.close();
		input.close();//关闭流
	}

}
