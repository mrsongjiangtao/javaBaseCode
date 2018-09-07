package com.nuc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderDemo {
	//������̨������ַ�����д�뵽�ı�
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;
		Reader reader = new InputStreamReader(input);
		BufferedReader bufReader = new BufferedReader(reader);
		
		File file = new File("D:\\testDir\\test.txt");
		Writer writer = new FileWriter(file);
		BufferedWriter bufWriter = new BufferedWriter(writer);
		
		while(true){
			String str = bufReader.readLine();
			if(str!=null&&str.equals("end")){
				break;
			}
			bufWriter.write(str);
			bufWriter.newLine();//����һ�У�д��
			bufWriter.flush();//ˢ����
		}
		bufWriter.close();
        writer.close();
        bufReader.close();
        reader.close();
	}

}
