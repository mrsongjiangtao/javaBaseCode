package com.nuc.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputStreamDemo2 {
	//字符流 读取控制台输入的字符串
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;//获取控制台输入
		Reader reader = new InputStreamReader(input);
		BufferedReader bufReader = new BufferedReader(reader);
		/* 加缓冲流之前*/
		char[] items=new char[100];
		int j=0;
		while((j=reader.read(items))!=-1){
			String str = new String(items,0,j);
			System.out.println(str);
		}
		reader.close();
	}

}
