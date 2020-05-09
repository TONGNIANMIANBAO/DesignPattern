package com.pattern.singleton;

/**
 * �o�B�Ȳ��
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton3 {
	private static class Singleton {
		private static Singleton3 instance = new Singleton3();
	}

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		return Singleton.instance;
	}

}
