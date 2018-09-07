package com.nuc.selfDefinedException;

public class Test {

	public static void main(String[] args) {
		FileUtils utils = new FileUtils();
		try {
			utils.upload("aa.xls", "D:/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
