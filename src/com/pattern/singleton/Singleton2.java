package com.pattern.singleton;

/**
 * �I�hʽ���o���̰�ȫ���}
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return instance;
	}
}
