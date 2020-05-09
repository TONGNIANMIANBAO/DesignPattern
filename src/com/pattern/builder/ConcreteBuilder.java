package com.pattern.builder;

/**
 * ˜‹½¨Õß
 * @author SEN.CHEN
 *
 */
public class ConcreteBuilder implements IBuilder {

	Production product = new Production();

	@Override
	public void buildParts() {
		product.addParts();
	}

	@Override
	public void addFun() {
		product.addFunction();
	}

	@Override
	public Production getProduct() {

		return product;
	}

}
