package com.nuc.basic;
/*
 * �������
 * ��1��+��-�ţ�
 * ��ʾ������ +��Ҳ��ʾ�ַ���ƴ��
 * ��2��* �˷�����  /���������  % ȡ���� ע�⣺java�з�ĸ����Ϊ0 ���Ϊ0 ���쳣
 * (3)λ����� |  &  >>  << >>>  <<<
 *  ������ѡ���ʴ��⣺2��3���ݣ�д����Ч�ʵļ�������2<<2;
 *  ++ ����
 *  --�Լ�
 *  (4)�߼��������||��  &&�룬Ҳ������·�����
 *  || ����������һ������true������Ϊtrue
 *  &&�����������뷵��boolean���ͣ�����ͬʱΪtrue����Ϊtrue
 * */
public class Operator {

	public static void main(String[] args) {
		double sal = 1244;
		String str = "JONES���ʣ�"+(sal+500);//ע�⣺�ַ���+���ֻ����ַ����� ����ı��������ȼ���ʹ��()
		System.out.println(str);
		
		//ע�⣺��������������������ͣ�����λ�������λ���ٵģ������㣬���ս������Ϊλ����ģ�long+double ����double  int/long+float ��
		int res = (int)(10*10.0);//int*double ���ؽ��Ϊdouble
		long d = 100L+(long)1234.5D;
		
		//ע�⣺ǿ��ת��ʱ (short)j+i �� short(j+i)��ͬ
		short total = 0;
		int j = 10;
		int s = 10;
		total = (short)(s+j);
		
		//ע���ĸ������Ϊ0  �쳣��ArithmeticException
		// double r=1/0;
		//�����������⣬�绰�����ʹ��ģ�java��1/2ֵ�Ƕ��٣�0  ������ 1
		int x=1;
		int y=2;
		double z=x/y;
		System.out.println("z="+z);
		
		//i++ ++i,--ͬ��
		int i = 0;
		//i�����1
		// i=i+1 ��ͬ�� i++;
		System.out.println("i="+(i++));//0 ԭ��i++��ʾi�ȱ�ʹ�ã�Ȼ���������1
		System.out.println("i="+i);//1
		System.out.println("i="+(++i));//2 ԭ��++i��ʾi������ȼ�1 Ȼ���ٱ�ʹ��
		//ע�⣺�����Ƿ�ǿת  
		short s1 = 1;
		s1 = (short) (s1+1);
		s1+=1;
		
		//�ַ����ԱȽϴ�С�������Ƚϵ���ASCII��
		boolean f='c'>'d';
		System.out.println(f);
		boolean f_0=(10>0)&&(100<100);//false
		boolean f_1=(10>0)||(100<10);//true
		
		System.out.println(f_0+":"+f_1);
		
		// || &&��ζ�·�ģ�
		int n=10;
		int m=100;
		boolean f_2=(n>m)&&((n=100000)<100); 
		System.out.println(n);//n��ֵ����10
		boolean f_3=(m>n)||((n=100000)<100); //n��ֵ����10
		System.out.println(n);
		
		//λ�����
		System.out.println("2����3λ="+(2<<2));//2����3λ
	}

}
