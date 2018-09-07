package com.nuc.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *  SAX������ʽ��jdk�Դ��Ľ�����ʽ��
 *  �¼�������ֻ�ܶ��ļ����ݽ��ж�ȡ���޷��޸�xml�ļ�����˽�����ʽ�����
 *  �������ļ���Ч�ʵ�
 * */
public class SaxParseUtils extends DefaultHandler{
	private List<Student> list = null;
	private String tag;//��ʱ�洢��ǩ
	Student stu = null;
	//�ı��ļ�����ʱִ�еķ���
	@Override
	public void startDocument() throws SAXException {
		 list=new ArrayList<Student>(); 
	}
	
	//������ʼԪ��ִ�и÷���:qName ��ǩ�� attributes ��ȡ��ǩ����ʹ��
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		tag = qName;
		if(qName!=null &&qName.equals("student")){//�����student��ʼ�ڵ�
			String stuno = attributes.getValue("stuno");//��ȡstuno����
			System.out.println(stuno);
			stu =new Student();
			stu.setStuno(stuno);
		}
	}
	
	//����������ǩ��ִ�и÷���
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName!=null&&qName.equals("student")){
			list.add(stu);
		}
		tag="";
	}
	//��ȡ��ǩ�ı����ݣ��Զ����õķ���
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		//���� �ı����ݷ����ַ����飬 ��ʼλ�ã��ͳ���
		if(tag!=null&&tag.equals("age")){
			String name = new String(ch,start,length);
			stu.setName(name);
		}else if(tag!=null&&tag.equals("age")){
			String age = new String(ch,start,length);
			stu.setAge(Integer.parseInt(age));
		}else if(tag!=null&&tag.equals("address")){
			String address = new String(ch,start,length);
			stu.setAddress(address);
		}
	}
	
	public List<Student> getList(){
		return list;
	}
	
	
	
	
}
