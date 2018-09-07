package com.nuc.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Work_022 {
	//以字节流形式，将某个test.txt文件复制到test1中
	public static void main(String[] args) throws Exception {
		File file = new File("D:\\testDir\\test.txt");
		File file1 = new File("D:\\testDir\\test1.txt");
		
		//输入流，将file读入内存
		InputStream input = new FileInputStream(file);
		BufferedInputStream bufInput = new BufferedInputStream(input);
		
		//输出流，与文件建立连接
		OutputStream output = new FileOutputStream(file1);
		BufferedOutputStream bufOutPut = new BufferedOutputStream(output);
		byte[] items = new byte[1024*10];//每次读取得数据，放入该数组中
		int i=0;// 每次读取数据的个数
		while((i=bufInput.read(items))!=-1){
			bufOutPut.write(items, 0, i);
			bufOutPut.flush();//刷新流
		}
		bufOutPut.close();
		output.close();
		bufInput.close();
		input.close();
	}

}
