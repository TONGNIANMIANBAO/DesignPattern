package com.pattern.mediator;

public class Colleague {
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public void doSelfMethod() {
		System.out.println("do self");
	}

	public void doDepMethod(String message) {
		mediator.message(this, message);
	}
}
