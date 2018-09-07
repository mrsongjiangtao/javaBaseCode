package com.nuc.work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Work_019 {
	public static List<String> getFile(String path) {//����ָ���ļ�Ŀ¼����ȡ����javaԴ�ļ���ֻҪ�ļ�����
		List<String> res = new ArrayList<String>();
		File filePath = new File(path);
		if(filePath!=null&&filePath.exists()&&filePath.isDirectory()){
			File[] files = filePath.listFiles();
			if(filePath!=null){
				for(File f:files){
					if(f.isFile()){
						String fileName = f.getName();//�ļ�����
						if(fileName.toLowerCase().endsWith(".java")){
							fileName = fileName.substring(0,fileName.length()-5);//ȥ��׺
							res.add(fileName);
						}
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		List<String> list = getFile("D:\\eclipse\\code\\IsoftEducation\\Basic\\src\\com\\nuc\\basic");
		for(String s:list){
			System.out.println(s);
		}
	}

}
