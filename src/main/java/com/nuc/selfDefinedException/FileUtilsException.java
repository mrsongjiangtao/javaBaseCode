package com.nuc.selfDefinedException;

public class FileUtilsException extends Exception{
	//��������Ϣ���ļ���ʽУ���쳣����
	public FileUtilsException(){
		super();
	}
	//��������Ϣ���ļ���ʽУ���쳣
	public FileUtilsException(String msg){
		super(msg);
	}
}
