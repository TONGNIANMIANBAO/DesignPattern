package com.pattern.vistor;

public class ConcreteElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
