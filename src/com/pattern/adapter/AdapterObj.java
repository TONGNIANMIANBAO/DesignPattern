package com.pattern.adapter;

/**
 * Œ¦ÏóßmÅäÆ÷
 * 
 * @author SEN.CHEN
 *
 */
public class AdapterObj implements ITarget {
	Adaptee adaptee;

	public AdapterObj(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public String writer() {
		return "is adapterobj";
	}

	@Override
	public void print() {
		adaptee.print();
	}

}
