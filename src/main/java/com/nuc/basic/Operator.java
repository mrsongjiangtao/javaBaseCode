package com.nuc.basic;
/*
 * 运算符：
 * （1）+号-号：
 * 表示正负数 +号也表示字符串拼接
 * （2）* 乘法运算  /除法运算符  % 取余数 注意：java中分母不能为0 如果为0 则报异常
 * (3)位运算符 |  &  >>  << >>>  <<<
 *  笔试题选择，问答题：2的3次幂，写出最效率的计算结果？2<<2;
 *  ++ 自增
 *  --自减
 *  (4)逻辑运算符：||或  &&与，也叫作短路运算符
 *  || 两边条件有一个满足true，则结果为true
 *  &&两边条件必须返回boolean类型，两边同时为true则结果为true
 * */
public class Operator {

	public static void main(String[] args) {
		double sal = 1244;
		String str = "JONES工资："+(sal+500);//注意：字符串+数字还是字符串； 如果改变运算优先级则使用()
		System.out.println(str);
		
		//注意：下面的运算结果的数据类型；规则：位数多的与位数少的，做运算，最终结果类型为位数多的（long+double 返回double  int/long+float ）
		int res = (int)(10*10.0);//int*double 返回结果为double
		long d = 100L+(long)1234.5D;
		
		//注意：强制转换时 (short)j+i 和 short(j+i)不同
		short total = 0;
		int j = 10;
		int s = 10;
		total = (short)(s+j);
		
		//注意分母不可以为0  异常：ArithmeticException
		// double r=1/0;
		//笔试题面试题，电话面试问过的：java中1/2值是多少？0  余数？ 1
		int x=1;
		int y=2;
		double z=x/y;
		System.out.println("z="+z);
		
		//i++ ++i,--同理
		int i = 0;
		//i自身加1
		// i=i+1 等同的 i++;
		System.out.println("i="+(i++));//0 原因：i++表示i先被使用，然后在自身加1
		System.out.println("i="+i);//1
		System.out.println("i="+(++i));//2 原因：++i表示i自身会先加1 然后再被使用
		//注意：下面是否强转  
		short s1 = 1;
		s1 = (short) (s1+1);
		s1+=1;
		
		//字符可以比较大小，不过比较的是ASCII码
		boolean f='c'>'d';
		System.out.println(f);
		boolean f_0=(10>0)&&(100<100);//false
		boolean f_1=(10>0)||(100<10);//true
		
		System.out.println(f_0+":"+f_1);
		
		// || &&如何短路的？
		int n=10;
		int m=100;
		boolean f_2=(n>m)&&((n=100000)<100); 
		System.out.println(n);//n的值还是10
		boolean f_3=(m>n)||((n=100000)<100); //n的值还是10
		System.out.println(n);
		
		//位运算符
		System.out.println("2左移3位="+(2<<2));//2左移3位
	}

}
