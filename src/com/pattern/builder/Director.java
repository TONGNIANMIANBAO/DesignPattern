package com.pattern.builder;

/**
 * Õ{¶ÈÕß
 * 
 * @author SEN.CHEN
 *
 */
public class Director {
	private IBuilder builder;

	public Director(IBuilder builder) {
		this.builder = builder;
	}

	// Õ{¶Èí˜Ğò
	public void produce() {
		builder.buildParts();
		builder.addFun();
	}
}
