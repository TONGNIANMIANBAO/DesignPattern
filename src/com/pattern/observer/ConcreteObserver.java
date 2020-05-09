package com.pattern.observer;

public class ConcreteObserver implements Observer {
	private String name;

	public ConcreteObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String state) {
		System.out.println(name + ":" + state);
	}

}
