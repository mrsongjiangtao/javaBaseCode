package com.nuc.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/*
 * DOM解析方式也是JDK自带的
 * */
public class DomXMLUtils {
	private static DocumentBuilderFactory docBuilderFactory;
	private static DocumentBuilder docBuilder;
	
	static{
		docBuilderFactory=DocumentBuilderFactory.newInstance();
		try {
			docBuilder=docBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void flushXMLStream(Document document,String xmlFile) throws Exception{
		//刷新这个XML文件
		DOMSource source = new DOMSource(document);
		String path = DomXMLUtils.class.getResource("/").toString();
		System.out.println(DomXMLUtils.class.getResource("/").toString());
		OutputStream stream=new FileOutputStream(new File(path.substring(path.indexOf("/")+1)+xmlFile));
		StreamResult result = new StreamResult(stream);
		TransformerFactory tran=TransformerFactory.newInstance();
		
		Transformer transformer=tran.newTransformer();
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");//格式化节点
		transformer.transform(source, result);
		stream.close();
	}
	
	public static List<Student> getStudents(String xmlFile) throws Exception{
		List<Student> list=new ArrayList<Student>();
		InputStream inputStream=DomXMLUtils.class.getClassLoader().getSystemResourceAsStream(xmlFile);
		 
		//解析
		Document document=docBuilder.parse(inputStream);
		//获取students根节点
		Element rootElement=document.getDocumentElement();
	    String students=	rootElement.getTagName();
		System.out.println("解析的根节点标签名："+students);
		
		//获取students子节点元素
		NodeList studentNodes=rootElement.getElementsByTagName("student");
		for(int i=0;i<studentNodes.getLength();i++){
			Student student=new Student();
			Element studentEle=(Element) studentNodes.item(i);
		    String stuno=	studentEle.getAttribute("stuno");
		    Element nameEle= (Element) studentEle.getElementsByTagName("name").item(0);
		    String name= nameEle.getTextContent();
		    Element ageEle= (Element) studentEle.getElementsByTagName("age").item(0);
		    String age= ageEle.getTextContent();
		    Element addressEle= (Element) studentEle.getElementsByTagName("address").item(0);
		   	String address= addressEle.getTextContent();
		   
		   	student.setAddress(address);
		   	student.setAge(Integer.parseInt(age));
		   	student.setName(name);
		   	student.setStuno(stuno);
		   	list.add(student);
		}
		
	/*	for(Student s:list){
			System.out.println(s.getAddress()+":"+s.getName()+":"+s.getStuno());
		}*/

		return list;
	}
	
	public static void addStudent(String xmlFile,Student student) throws Exception{
		InputStream inputStream=DomXMLUtils.class.getClassLoader().getSystemResourceAsStream(xmlFile);
		 
		//解析
		Document document=docBuilder.parse(inputStream);
		Element studentEle=document.createElement("student");
		if(student!=null){
			String stuno=student.getStuno();
			studentEle.setAttribute("stuno", stuno);//属性赋值
			//student中创建name、age、address
			Element nameEle=	document.createElement("name");
			nameEle.setTextContent(student.getName());
			Element ageEle=	document.createElement("age");
			ageEle.setTextContent(student.getAge().toString());
			Element addressEle=	document.createElement("address");
			addressEle.setTextContent(student.getAddress());
			studentEle.appendChild(nameEle);
			studentEle.appendChild(ageEle);
			studentEle.appendChild(addressEle);
		}
		//获取students根节点
		Element rootElement=document.getDocumentElement();
		rootElement.appendChild(studentEle);
		
		//刷新这个XML文件
		flushXMLStream(document,xmlFile);
	}
	
	public static void deleteStudent(String xmlFile,String stuno) throws Exception{
		InputStream inputStream=DomXMLUtils.class.getClassLoader().getSystemResourceAsStream(xmlFile);
		 
		//解析
		Document document=docBuilder.parse(inputStream);
		Element studentEle=document.createElement("student");
		if(stuno!=null){
			//获取students根节点
			Element rootElement=document.getDocumentElement();
		    NodeList nodes=rootElement.getElementsByTagName("student");
		    for(int i=0;i<nodes.getLength();i++){
		    	Element stuEle=	(Element) nodes.item(i);
		    	if(stuEle.getAttribute("stuno").toString().equals(stuno)){
		    		rootElement.removeChild(stuEle);
		      
		    	}
		    }
		}
		//刷新这个XML文件
		flushXMLStream(document,xmlFile);
	}
	public static void main(String[] args) throws Exception {
//		addStudent("com/nuc/xml/student.xml",new Student("2001", "SS", "天津",21));
		deleteStudent("com/nuc/xml/student.xml","1001");
	}

}
