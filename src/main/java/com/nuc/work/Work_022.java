package com.nuc.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Work_022 {
	//���ֽ�����ʽ����ĳ��test.txt�ļ����Ƶ�test1��
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\testDir\\test.txt");
		File file1 = new File("D:\\testDir\\test1.txt");
		
		//����������file�����ڴ�
		InputStream input = new FileInputStream(file);
		BufferedInputStream bufInput = new BufferedInputStream(input);
		
		//����������ļ���������
		OutputStream output = new FileOutputStream(file1);
		BufferedOutputStream bufOutPut = new BufferedOutputStream(output);
		byte[] items = new byte[1024*10];//ÿ�ζ�ȡ�����ݣ������������
		int i=0;// ÿ�ζ�ȡ���ݵĸ���
		while((i=bufInput.read(items))!=-1){
			bufOutPut.write(items, 0, i);
			bufOutPut.flush();//ˢ����
		}
		bufOutPut.close();
		output.close();
		bufInput.close();
		input.close();
	}

}
