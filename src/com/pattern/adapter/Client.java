package com.pattern.adapter;

/**
 * �m����ģʽ�� ��춼��ݡ���m�����^��Adaptee�������m�������^��Adaptee��ֻ����ԓ����
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		System.out.println(adapter.writer());
		adapter.print();

		AdapterObj obj = new AdapterObj(new Adaptee());
		System.out.println(obj.writer());
		obj.print();
	}

}
