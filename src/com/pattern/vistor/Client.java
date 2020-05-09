package com.pattern.vistor;

/**
 * 訪問者模式：它包含访问者和被访问元素两个主要组成部分
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Element a = new ConcreteElementA();
		Element b = new ConcreteElementB();

		ObjectStructure osr = new ObjectStructure();
		osr.addElememt(b);
		osr.addElememt(a);

		Visitor v1 = new ConcreteVisitorA();
		Visitor v2 = new ConcreteVisitorB();
		osr.show(v1);
		osr.show(v2);

	}

}
