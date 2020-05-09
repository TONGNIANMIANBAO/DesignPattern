package com.pattern.chainOfResponsibility;

/**
 * ؟���ģʽ��ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ��
 * �������������һ���������������������ݸ�����ֱ����һ����������Ϊֹ��
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler();
		Handler handler2 = new ConcreteHandler();

		handler1.setHandler(handler2);
		handler1.dealRequest("chain of responsibility");
	}

}
