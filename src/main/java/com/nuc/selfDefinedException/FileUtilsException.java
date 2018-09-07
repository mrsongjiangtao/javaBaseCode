package com.nuc.selfDefinedException;

public class FileUtilsException extends Exception{
	//构建无消息的文件格式校验异常对象
	public FileUtilsException(){
		super();
	}
	//构建有消息的文件格式校验异常
	public FileUtilsException(String msg){
		super(msg);
	}
}
