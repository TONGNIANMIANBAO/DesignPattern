package com.pattern.mediator;

public class ConcreteMediator implements Mediator {

	@Override
	public void message(Colleague c, String m) {
		System.out.println("[" + c + "]:" + m);
	}

}
