package com.nuc.work;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Work_021 {

	public static void main(String[] args) throws Exception {
		//��һ���ַ�����ͨ���ֽ��������д�뵽ĳ��һ�ļ���
		String str = "sjt�ν���";
		InputStream input = new ByteArrayInputStream(str.getBytes());
		File file = new File("D:\\testDir\\test.txt");//û���ļ����Զ������ļ�
		OutputStream output = new FileOutputStream(file);
		byte[] items = new byte[5];
		int i=0;
		while((i=input.read(items))!=-1){
			output.write(items,0,i);//д���ļ�
		}
		output.close();
		input.close();
	}

}
