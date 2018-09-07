package com.nuc.xml;

import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParseTest {

	public static void main(String[] args) throws Exception{
		SaxParseUtils utils = new SaxParseUtils();
		//创建解析工厂
		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		//获取解析器
		SAXParser parser = saxFactory.newSAXParser();
		InputStream inputStream = SaxParseTest.class.getClassLoader().getSystemResourceAsStream("com/nuc/xml/student.xml");
		parser.parse(inputStream,utils);
		List<Student> list = utils.getList();
		for(int i=0;i<list.size();i++){
			Student s = list.get(i);
			System.out.println(s.getAddress()+":"+s.getName()+":"+s.getStuno());
		}
	}

}
