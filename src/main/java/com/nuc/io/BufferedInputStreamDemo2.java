package com.nuc.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputStreamDemo2 {
	//�ַ��� ��ȡ����̨������ַ���
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;//��ȡ����̨����
		Reader reader = new InputStreamReader(input);
		BufferedReader bufReader = new BufferedReader(reader);
		/* �ӻ�����֮ǰ*/
		char[] items=new char[100];
		int j=0;
		while((j=reader.read(items))!=-1){
			String str = new String(items,0,j);
			System.out.println(str);
		}
		reader.close();
	}

}
