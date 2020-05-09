package com.pattern.singleton;

/**
 * 餓漢式，無線程安全問題
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
