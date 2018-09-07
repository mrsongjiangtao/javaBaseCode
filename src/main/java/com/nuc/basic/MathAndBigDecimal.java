package com.nuc.basic;

import java.math.BigDecimal;
import java.util.Random;

public class MathAndBigDecimal {
	//�Ӽ��˳�����������ȷ���
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
	//����޷����������쳣���쳣��ν����a.divide (b,2,BigDecimal.ROUND_HALF_UP);
	public static BigDecimal divide(BigDecimal a,BigDecimal b){
		if(a!=null&&b!=null){
			return a.divide(b,2,BigDecimal.ROUND_HALF_UP);//������������뾫ȷ��λС��
		}
		return null;
		
	}
	
	//��������ȡ��λС��
	public static BigDecimal getBDScale(BigDecimal a,int scale){
		if(a!=null){
			return a.setScale(scale,BigDecimal.ROUND_HALF_UP);
		}
		return null;
	}
	
	public static void main(String[] args) {
		//��ȡĳ��double����������ӽ�������(��������ȡ��)
		System.out.println(Math.round(19.52));
		
		System.out.println(Math.round(-11.5));
		System.out.println(Math.round(-11.6));
		//��ȡ0.0-1.0֮������С��(double)������0������1
		System.out.println("random"+Math.random());
		//����ֵ
		System.out.println(Math.abs(-19));
		//����ȡ�� ����double
		System.out.println(Math.floor(2.2));
		//����ȡ�� ����double
		System.out.println(Math.ceil(22.1));
		
		//0-10֮���������� nextInt(10),����0��������10
		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		//10-20
		for(int i=1;i<=10;i++){
			int j = random.nextInt(10)+10;
			System.out.println(j);
		}
		
		//0-1֮�����С��,����0������1
		System.out.println(random.nextDouble());
		
		System.out.println("------BigDecimal-----");
		double d = 19.123456789123456789;//��Ч15λ��float7λ
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
