package com.pattern.decorator;

public class Decorator implements ISource {

	ISource source;

	public Decorator(ISource source) {
		super();
		this.source = source;
	}

	@Override
	public void print() {
		System.out.println("before ");
		source.print();
		System.out.println("after ");
	}

}
