package com.pattern.facade;

/**
 * ���^ģʽ�������L����ϵ�y���}�s�ȡ��ṩ�ⲿ�L��ϵ�y�Ľӿ�
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
