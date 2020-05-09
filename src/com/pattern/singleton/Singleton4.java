package com.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Double Checked Locking �p�ؙz��i
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton4 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// volatile ����Ӄȴ�������ָֹ��������
	private volatile static Singleton4 instance;

	private Singleton4() {
		// ����ȷ���@�Ì������t�˷������ܷ�ֹ����©��
		if (null != instance) {
			throw new RuntimeException();
		}
	}

	public static Singleton4 getInstance() {
		if (instance == null) {// single checked
			synchronized (Singleton4.class) {
				if (instance == null) {// double checked
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}

	// ��ֹ���л�©��
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
