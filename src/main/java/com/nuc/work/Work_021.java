package com.nuc.work;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Work_021 {

	public static void main(String[] args) throws Exception {
		//将一个字符串，通过字节输出流，写入到某个一文件中
		String str = "sjt宋江涛";
		InputStream input = new ByteArrayInputStream(str.getBytes());
		File file = new File("D:\\testDir\\test.txt");//没有文件会自动创建文件
		OutputStream output = new FileOutputStream(file);
		byte[] items = new byte[5];
		int i=0;
		while((i=input.read(items))!=-1){
			output.write(items,0,i);//写入文件
		}
		output.close();
		input.close();
	}

}
