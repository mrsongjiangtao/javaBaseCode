package com.nuc.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		//���ֽ���Ϊ��λ����һ���ַ���д���ڴ棬�����
		String str = "sjt�ν���";
		//���ֽ��������ݣ��������ֽ���������
		InputStream input = new ByteArrayInputStream(str.getBytes());
		//��ȡ���е�����
		while(true){
			int i = input.read();//û�в�����read��������ʱÿ�ζ�ȡ������һ���ֽ�Ϊ��λ��ȡ����,���ؽ����ÿ�ζ�ȡ�����ݣ������ȡ��ϻ��������ݿɶ� ����-1
			if(i==-1){
				break;
			}
			System.out.println((char)i);
		}
		input.close();//�ر���
	}

}
