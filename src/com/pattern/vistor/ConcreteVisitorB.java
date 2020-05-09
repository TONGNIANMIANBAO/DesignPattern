package com.pattern.vistor;

public class ConcreteVisitorB implements Visitor {

	@Override
	public void visit(ConcreteElementA a) {
		System.out.println("VisitorB elementA");
	}

	@Override
	public void visit(ConcreteElementB b) {
		System.out.println("VisitorB elementB");
	}

}
