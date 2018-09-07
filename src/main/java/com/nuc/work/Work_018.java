package com.nuc.work;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Work_018 {
	public static List<String> getDirList(File dir){//根据指定文件目录，获取该文件目录(当前目录不涉及子目录)中所有文件夹列表
		List<String> res = new ArrayList<String>();
		if(dir!=null){
			if(dir.exists()&&dir.isDirectory()){
				File[] files = dir.listFiles();//获取文件列表
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
