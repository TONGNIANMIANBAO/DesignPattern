package com.pattern.builder;

/**
 * ������ģʽ���������Ό���M���}�s����
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
