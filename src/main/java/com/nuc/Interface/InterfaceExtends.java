package com.nuc.Interface;
/**
 * 接口interface是特殊抽象类，所有方法都是抽象方法
 * 不能被实例化，方法abstract关键词可以省略；
 * 变量是常量，省略final关键词；不能被实例化,默认为final
 * 使用时，需要通过类实现（implements）
 * 重写所有抽象方法
 * 
 * 好处：1、java由于单继承，接口可以弥补无法多继承的缺点；java中接口可以多继承；
 *        一个实现类，可以实现多个接口
 *      2、好的程序要求高内聚低耦合，接口可以实现程序的解耦
 *      3、定义一种规范
 * */
public interface InterfaceExtends extends InterfaceC,InterfaceD{
	public String FILE_PATH="D:/";
	public   void eat();
	public   void drink();
}
