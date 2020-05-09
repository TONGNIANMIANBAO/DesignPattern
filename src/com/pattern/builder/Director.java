package com.pattern.builder;

/**
 * �{����
 * 
 * @author SEN.CHEN
 *
 */
public class Director {
	private IBuilder builder;

	public Director(IBuilder builder) {
		this.builder = builder;
	}

	// �{�����
	public void produce() {
		builder.buildParts();
		builder.addFun();
	}
}
