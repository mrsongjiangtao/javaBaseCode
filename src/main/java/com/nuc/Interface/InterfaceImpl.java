package com.nuc.Interface;
/**
 * 实现类，实现接口，重写所有抽象方法
 * */
public class InterfaceImpl implements InterfaceExtends,InterfaceA,InterfaceB{

	@Override
	public void c() {
		System.out.println("C");
	}

	@Override
	public void d() {
		System.out.println("D");		
	}

	@Override
	public void b() {
		System.out.println("B");		
	}

	@Override
	public void a() {
		System.out.println("A");
	}

	@Override
	public void eat() {
		System.out.println("EAT");
	}

	@Override
	public void drink() {
		System.out.println("DRINK");
	}

}
