package com.nuc.selfDefinedException;

public class FileUtils {//�ļ�����������
	//�ļ��ϴ�(ģ��)
	public void upload(String fileName,String path) throws Exception{
		if(fileName!=null&&!fileName.trim().equals("")){
			if(path!=null&&!path.trim().equals("")){
				//�ļ���ʽ��֤�����ļ���ʽֻ����.xls��ʽ
				boolean f = fileName.toLowerCase().endsWith(".xls");
				if(!f){
					throw new FileUtilsException("�ļ����Ͳ���ȷ��");
				}
				System.out.println("�ļ��ϴ�..... �ɹ���");
			}else{
				throw new NullPointerException("�ļ��洢·��Ϊ�գ�");
			}
		}else{
			throw new FileUtilsException("�ļ�����Ϊ�գ�");
		}
	}
}
