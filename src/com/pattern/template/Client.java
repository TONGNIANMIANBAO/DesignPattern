package com.pattern.template;

/**
 * ģ�淽��ģʽ������һ���������㷨�ĹǼܣ�����һЩ�����ӳٵ������У�ģ�巽��ʹ��������Բ��ı��㷨�Ľṹ�����ض�����㷨��ĳЩ�ض����衣
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Template a = new ConcreteA();
		a.operation();

		Template b = new ConcreteB();
		b.operation();
	}

}
