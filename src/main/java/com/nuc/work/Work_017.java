package com.nuc.work;

import java.io.File;

public class Work_017 {
	public static void mkdir(String path,String dirName) throws Exception{//根据指定文件目录，创建一个目录
		try{
			File file = new File(path);//通过将给定路径名字符串转换为抽象路径名来创建一个新 File实例
			if(file.exists()){//判断文件或者文件目录是否存在(判断path指定的目录是否存在)
				if(file.isDirectory()){//判断path指定的file对象是否是目录，是目录则创建子目录
					File resFile = new File(file,dirName);
					resFile.mkdirs();//创建一层目录
//					resFile.createNewFile();//创建文件
					System.out.println("创建成功");
				}
				System.out.println("存在");
			}else{
				System.out.println("不存在");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("子目录创建失败！");
		}
	}
	public static void main(String[] args) {
		try {
			mkdir("D:\\" , "testDir");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
