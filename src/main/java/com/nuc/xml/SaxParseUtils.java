package com.nuc.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *  SAX解析方式是jdk自带的解析方式；
 *  事件驱动，只能对文件数据进行读取，无法修改xml文件，因此解析方式不灵活
 *  解析大文件，效率低
 * */
public class SaxParseUtils extends DefaultHandler{
	private List<Student> list = null;
	private String tag;//临时存储标签
	Student stu = null;
	//文本文件加载时执行的方法
	@Override
	public void startDocument() throws SAXException {
		 list=new ArrayList<Student>(); 
	}
	
	//遇到开始元素执行该方法:qName 标签名 attributes 获取标签属性使用
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		tag = qName;
		if(qName!=null &&qName.equals("student")){//如果是student开始节点
			String stuno = attributes.getValue("stuno");//获取stuno属性
			System.out.println(stuno);
			stu =new Student();
			stu.setStuno(stuno);
		}
	}
	
	//遇到结束标签则执行该方法
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName!=null&&qName.equals("student")){
			list.add(stu);
		}
		tag="";
	}
	//获取标签文本内容，自动调用的方法
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		//参数 文本内容放入字符数组， 开始位置，和长度
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
