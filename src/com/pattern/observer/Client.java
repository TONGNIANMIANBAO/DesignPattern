package com.pattern.observer;

/**
 * 觀察者模式：在对象之间定义了一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象会收到通知并自动更新。
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
