package com.nuc.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		//以字节流为单位，将一个字符串写入内存，并输出
		String str = "sjt宋江涛";
		//将字节数组数据，放入了字节输入流中
		InputStream input = new ByteArrayInputStream(str.getBytes());
		//读取流中的数据
		while(true){
			int i = input.read();//没有参数的read方法，此时每次读取都是以一个字节为单位读取数据,返回结果即每次读取得数据，如果读取完毕或者无数据可读 返回-1
			if(i==-1){
				break;
			}
			System.out.println((char)i);
		}
		input.close();//关闭流
	}

}
