package com.nuc.Interface;
/**
 * �ӿ�interface����������࣬���з������ǳ��󷽷�
 * ���ܱ�ʵ����������abstract�ؼ��ʿ���ʡ�ԣ�
 * �����ǳ�����ʡ��final�ؼ��ʣ����ܱ�ʵ����,Ĭ��Ϊfinal
 * ʹ��ʱ����Ҫͨ����ʵ�֣�implements��
 * ��д���г��󷽷�
 * 
 * �ô���1��java���ڵ��̳У��ӿڿ����ֲ��޷���̳е�ȱ�㣻java�нӿڿ��Զ�̳У�
 *        һ��ʵ���࣬����ʵ�ֶ���ӿ�
 *      2���õĳ���Ҫ����ھ۵���ϣ��ӿڿ���ʵ�ֳ���Ľ���
 *      3������һ�ֹ淶
 * */
public interface InterfaceExtends extends InterfaceC,InterfaceD{
	public String FILE_PATH="D:/";
	public   void eat();
	public   void drink();
}
