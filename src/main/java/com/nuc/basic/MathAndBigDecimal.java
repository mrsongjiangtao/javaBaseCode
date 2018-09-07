package com.nuc.basic;

import java.math.BigDecimal;
import java.util.Random;

public class MathAndBigDecimal {
	//加减乘除，四舍五入等方法
	//a+b
	public static BigDecimal sum(BigDecimal a,BigDecimal b){
		if(a!=null&&b!=null){
			return a.add(b);
		}
		return null;
	}
	
	//a-b
	public static BigDecimal subtract(BigDecimal a,BigDecimal b){
		if(a!=null&&b!=null){
			return a.subtract(b);
		}
		return null;
	}
	
	//a*b
	public static BigDecimal multiply(BigDecimal a,BigDecimal b){
		if(a!=null&b!=null){
			return a.multiply(b);
		}
		return null;
	}
	
	//a/b
	//如果无法整除会有异常？异常如何解决？a.divide (b,2,BigDecimal.ROUND_HALF_UP);
	public static BigDecimal divide(BigDecimal a,BigDecimal b){
		if(a!=null&&b!=null){
			return a.divide(b,2,BigDecimal.ROUND_HALF_UP);//结果会四舍五入精确两位小数
		}
		return null;
		
	}
	
	//四舍五入取几位小数
	public static BigDecimal getBDScale(BigDecimal a,int scale){
		if(a!=null){
			return a.setScale(scale,BigDecimal.ROUND_HALF_UP);
		}
		return null;
	}
	
	public static void main(String[] args) {
		//获取某个double类型数据最接近的整数(四舍五入取整)
		System.out.println(Math.round(19.52));
		
		System.out.println(Math.round(-11.5));
		System.out.println(Math.round(-11.6));
		//获取0.0-1.0之间的随机小数(double)，包括0不包括1
		System.out.println("random"+Math.random());
		//绝对值
		System.out.println(Math.abs(-19));
		//向下取整 返回double
		System.out.println(Math.floor(2.2));
		//向上取整 返回double
		System.out.println(Math.ceil(22.1));
		
		//0-10之间的随机整数 nextInt(10),包括0，不包括10
		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		//10-20
		for(int i=1;i<=10;i++){
			int j = random.nextInt(10)+10;
			System.out.println(j);
		}
		
		//0-1之间随机小数,包括0不包括1
		System.out.println(random.nextDouble());
		
		System.out.println("------BigDecimal-----");
		double d = 19.123456789123456789;//有效15位，float7位
		System.out.println(d);
		BigDecimal b = new BigDecimal("10.123456789123456789");
		System.out.println(b.toString());
		BigDecimal b1 = new BigDecimal("12.123456789123456789");
		BigDecimal b2 = new BigDecimal("10");
		
		System.out.println(sum(b1,b2));
		System.out.println(subtract(b1, b2));
		System.out.println(divide(b1, b2));
		System.out.println(getBDScale(b1,4));
	}

}
