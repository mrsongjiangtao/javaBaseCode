package com.nuc.extendAndClass;
/*
 * 类：class 描述的是一类事物，可以认为是一个模板；
 * 对象：万物皆对象，即，一类事物中的一个个体；
 * 方法：即这一类事物所具有的动作； 
 * 属性：描述一类事物所具有的特性或者特点；程序里体现的是全局变量；
 * 
 * 面向对象：即分析某一个事件中有哪些对象，分析他们的动作，具有的属性特点，通过这种方式来解决问题；
 * 面向对象编程：
 * 例如：张三 开门
 * 将分析的对象定义成为类，通过方法，属性进行描述类；
 * 通过创建对象来实现操作；
 * 
 * 面向过程：侧重点在于步骤，通过一步一步调用函数来实现操作；
 * 张三去软通动力入职：
 * 面向对象角度出发： 对象张三  动作 去哪儿？ 干什么？
 * 面向过程角度出发: 去哪儿？  干啥？ 
 * 
 * 必须记住：
 * 面向对象三个过程：
 * OOA面向对象分析 
 * OOD面向对象设计
 * OOP面向对象编程
 * 
 * 面向对象三个特性(属性)
 * 继承、多态、封装
 * 
 * 访问修饰符：public 相同包，不同包，都可访问
 *          不写 只有相同包下可以访问
 *          private 只有当前类可以访问
 * 
 * this:表示当前类对象，不能用于static声明的方法中，常用于区分局部变量和全局变量同名；
 * 
 * */
public class Student {
	//属性
    private  String stuName;//姓名
    private  String address;
    private  int age;
    
    //void表示没有返回值，就不能return
    public void study(String scName){
    	System.out.println("学习课程："+scName);
    }
    
    public void print(){
    	System.out.println("姓名："+stuName+"年龄："+age+"地址："+address);
    }
    
    //get set 方法
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
