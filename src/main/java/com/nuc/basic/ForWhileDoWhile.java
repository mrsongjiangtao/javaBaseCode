package com.nuc.basic;

public class ForWhileDoWhile {

	public static void main(String[] args) {
		System.out.println("-----for------");
		
		//for循环语句结构；输出1-5之间数字,以及他们的和
		int sum =0;
		for(int i=1;i<=5;i++){
			System.out.println("i="+i);
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("-----while1------");
		
		//while
		int j=1;
		while(j<=5){
			System.out.println("j="+j);
			j++;
		}
		
		System.out.println("-----while2------");

		//一般情况下，不知道循环次数，知道什么时候退出，此时用while  否则一律for
		int a=1;
		while(true){
			if(a==3){
				break;//break 表示退出整个循环或者判断
			}
			System.out.println("a="+a);
			a++;
		}
		
		System.out.println("-----do while------");

		//do while循环 至少执行一次，然后在判断是否满足条件，继续循环
		int k = 3;
		do{
			System.out.println("i="+k);
			k--;
		}
		while(k>0);
		
		System.out.println("-----continue------");

		//continue 只能用于循环体中，表示退出当前循环，继续下一次循环
		for(int n=1;n<=3;n++){
			if(n==2){
				continue;
			}
			System.out.println("n="+n);//不输出2
		}
	}
}
