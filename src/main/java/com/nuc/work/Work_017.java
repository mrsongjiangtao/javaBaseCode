package com.nuc.work;

import java.io.File;

public class Work_017 {
	public static void mkdir(String path,String dirName) throws Exception{//����ָ���ļ�Ŀ¼������һ��Ŀ¼
		try{
			File file = new File(path);//ͨ��������·�����ַ���ת��Ϊ����·����������һ���� Fileʵ��
			if(file.exists()){//�ж��ļ������ļ�Ŀ¼�Ƿ����(�ж�pathָ����Ŀ¼�Ƿ����)
				if(file.isDirectory()){//�ж�pathָ����file�����Ƿ���Ŀ¼����Ŀ¼�򴴽���Ŀ¼
					File resFile = new File(file,dirName);
					resFile.mkdirs();//����һ��Ŀ¼
//					resFile.createNewFile();//�����ļ�
					System.out.println("�����ɹ�");
				}
				System.out.println("����");
			}else{
				System.out.println("������");
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception("��Ŀ¼����ʧ�ܣ�");
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
