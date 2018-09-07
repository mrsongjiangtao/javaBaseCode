package com.nuc.selfDefinedException;

public class FileUtils {//文件操作工具类
	//文件上传(模拟)
	public void upload(String fileName,String path) throws Exception{
		if(fileName!=null&&!fileName.trim().equals("")){
			if(path!=null&&!path.trim().equals("")){
				//文件格式验证：该文件格式只能是.xls格式
				boolean f = fileName.toLowerCase().endsWith(".xls");
				if(!f){
					throw new FileUtilsException("文件类型不正确！");
				}
				System.out.println("文件上传..... 成功！");
			}else{
				throw new NullPointerException("文件存储路径为空！");
			}
		}else{
			throw new FileUtilsException("文件名能为空！");
		}
	}
}
