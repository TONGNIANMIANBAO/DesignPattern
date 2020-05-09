package com.pattern.observer;

/**
 * �^����ģʽ���ڶ���֮�䶨����һ�Զ������������һ������һ������ı�״̬���������Ķ�����յ�֪ͨ���Զ����¡�
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Observer os1 = new ConcreteObserver("first");
		Observer os2 = new ConcreteObserver("second");
		Observer os3 = new ConcreteObserver("third");

		ConcreteSubject sub = new ConcreteSubject();
		sub.attach(os3);
		sub.attach(os2);
		sub.attach(os1);

		sub.setState("attach");

		sub.detach(os2);

		sub.setState("detach");
	}

}
