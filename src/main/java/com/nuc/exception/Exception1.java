package com.nuc.exception;

public class Exception1 {
	public void test2()throws Exception{
		System.out.println("测试");
	}
	//throws 方法声明时使用，表示该方法可能产生的异常，抛出，由调用方进行捕获处理
	public static void main(String[] args) throws Exception{
		//try中的代码是，需要捕获异常的代码段（可能产生某些异常的代码段）
		try{
			System.out.println("开始！");
			String str = null;
			int i = str.length();
			int j = 1/0;
			System.out.println("over!");
		}catch(ArithmeticException e){
			//在catch中处理捕获异常
			e.printStackTrace();//显示异常信息
			System.out.println(e.getMessage());
		}catch(NullPointerException e2){
			e2.printStackTrace();
			System.out.println(e2.getMessage());
			throw new Exception();//抛出一个具体异常，谁调用该方法，谁捕获处理
		}finally{//可以省略不写，不论是否有没有异常，都执行的代码段
			System.out.println("可以省略不写，不论是否有没有异常，都执行的代码段");
		}
		//继续执行
		String str1 = "JONES";
		str1 = str1.substring(0,3);//左闭右开
		System.out.println(str1);
	}
}
