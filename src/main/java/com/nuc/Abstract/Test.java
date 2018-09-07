package com.nuc.Abstract;

public class Test {

	public static void main(String[] args) {
		AbstractExtends abse = new AbstractExtends();
		AbstractClass absc = new AbstractExtends();
		
		abse.drink();
		abse.eat("大米");
		
		absc.drink();
		absc.eat("面条");
		
	}

}
