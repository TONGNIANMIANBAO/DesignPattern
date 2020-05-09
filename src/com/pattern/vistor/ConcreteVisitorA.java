package com.pattern.vistor;

public class ConcreteVisitorA implements Visitor {

	@Override
	public void visit(ConcreteElementA a) {
		System.out.println("visitA elementA");
	}

	@Override
	public void visit(ConcreteElementB b) {
		System.out.println("visitA elementB");
	}

}
