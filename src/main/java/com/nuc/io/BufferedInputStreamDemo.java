package com.nuc.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException {
		//���ֽ���Ϊ��λ����һ���ַ���д���ڴ棬�����2
		String str = "�ν�sjt";
		InputStream input = new ByteArrayInputStream(str.getBytes());
		BufferedInputStream bufInput = new BufferedInputStream(input);
		//��ȡ���е�����
		
		byte[] items = new byte[5];
//		while(true){
//			//�÷�������ֵ�����Ƕ�ȡ�������ˣ����Ƕ�ȡ���ݵĸ����� �����Ƕ�ȡ�����ݣ��ֽ����飩
//			int i = input.read(items);
//			//��ʱiΪ��ȡ���ݵĸ���������޶�ȡ���ݣ��򷵻�-1
//			if(i==-1){
//				break;
//			}
//			System.out.println("��ȡ�����ֽڸ���Ϊ:"+i);
//			String s = new String(items);
//			System.out.println(s);
//		}
		/*
		 * ��ȡ�����ֽڸ���Ϊ:5
		       �ν�s
		       ��ȡ�����ֽڸ���Ϊ:2
		   jt��s

		���������ԭ���ַ�����7���ֽ�(2+2+1+1+1);
		��һ������ȡ�����ڶ���ֻ��ȡ�ˣ�jt�������Ͷ����������ַ�����
		�����ֻ�ǵ�һ�ζ�ȡ�ģ��ڶ����ֽ�����û�и��ǵ������У�234λ�õ�ֵ��
		 * 
		 */
		int i = 0;//��ȡ�ֽڸ�����ÿ�ζ�ȡ���ݵĸ���
		while((i=bufInput.read(items))!=-1){
			String res = new String(items,0,i);
			System.out.println(res);
		}
		bufInput.close();
		input.close();//�ر���
	}

}
