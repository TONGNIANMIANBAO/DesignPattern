package com.pattern.mediator;

/**
 * �ٽ���ģʽ
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague coll = new Colleague(mediator);
		coll.doSelfMethod();
		coll.doDepMethod("mediator method");
	}
}
