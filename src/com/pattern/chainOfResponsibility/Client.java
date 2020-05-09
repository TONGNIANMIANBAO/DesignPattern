package com.pattern.chainOfResponsibility;

/**
 * 責任鏈模式：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。
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
