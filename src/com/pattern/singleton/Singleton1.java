package com.pattern.singleton;

/**
 * �Нhʽ,�о��̰�ȫ���}
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton1 {
	private static Singleton1 instance;

	private Singleton1() {
	}

	// synchronized ���̰�ȫ
	public static synchronized Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
