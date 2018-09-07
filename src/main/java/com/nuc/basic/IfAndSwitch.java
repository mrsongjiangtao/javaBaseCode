package com.nuc.basic;

public class IfAndSwitch {

	public static void main(String[] args) {
		//三目运算符
		String str = (10>100)?"YES":"NO";
		int i = (10>100)?(int)10.2:200;
		System.out.println(str+"---"+i);
		
		//条件判断语句
		int age = 52;
		if(age>10&&age<=18){
			System.out.println("青少年1");
		}else{
			System.out.println("不是青少年");
		}
		
		if(age>=10&&age<=18)
			System.out.println("青少年2"); //注意，没有写{}只针对后面一行起作用
		
		//多条件
		if(age<=10){
			System.out.println("少年");
		}else if(age>10&&age<=18){
			System.out.println("青少年");
		}else if(age>=18&&age<25){
			System.out.println("成年");
		}else if(age>=25&&age<=50){
			System.out.println("中年");
		}else{
			System.out.println("老年");
		}
		
		//流程控制语句,只能做等值判断;参数要求：byte、short、int、char、jdk7 String
		
		//switch
		int j=4;
		switch(j){
		case 1:
			System.out.println("j=1");
			break;
		case 2:
			System.out.println("j=2");
			break;
		case 3:
			System.out.println("j=3");
			break;
		default:
			System.out.println("前面不满足条件！");
			break;
		}

	}

}
