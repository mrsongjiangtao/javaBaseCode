package com.nuc.work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Work_018 {
	public static List<String> getDirList(File dir){//����ָ���ļ�Ŀ¼����ȡ���ļ�Ŀ¼(��ǰĿ¼���漰��Ŀ¼)�������ļ����б�
		List<String> res = new ArrayList<String>();
		if(dir!=null){
			if(dir.exists()&&dir.isDirectory()){
				File[] files = dir.listFiles();//��ȡ�ļ��б�
				for(File file:files ){
					if(file.isDirectory()){
						res.add(file.getPath());
					}
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		List<String> list = getDirList(new File("D:\\eclipse\\code\\IsoftEducation"));
		for(String s :list){
			System.out.println(s);
		}
		
	}

}
