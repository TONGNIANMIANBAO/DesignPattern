package com.pattern.decorator;

/**
 * �b���ģʽ�� �������ӹ��ܡ��b���c���b���Fͬһ���ӿڣ� �b��������뱻�b������á�
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		ISource source = new Source();
		ISource decorator = new Decorator(source);
		decorator.print();
	}

}
