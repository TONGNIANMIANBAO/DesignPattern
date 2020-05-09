package com.pattern.builder;

/**
 * 建造者模式：多個簡單對象組成複雜對象
 * 
 * @author SEN.CHEN
 *
 */
public class TestBuilder {

	public static void main(String[] args) {
		IBuilder builder = new ConcreteBuilder();

		new Director(builder).produce();
	}

}
