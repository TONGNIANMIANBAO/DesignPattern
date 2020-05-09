package com.pattern.singleton;

/**
 * 懶漢式,有線程安全問題
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	// synchronized 線程安全
	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
