package com.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Double Checked Locking 雙重檢驗鎖
 * 
 * @author SEN.CHEN
 *
 */
public class Singleton4 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// volatile 會添加內存屏障阻止指令重排序
	private volatile static Singleton4 instance;

	private Singleton4() {
		// 如果先反射獲得實例，則此方法不能防止反射漏洞
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

	// 防止序列化漏洞
	private Object readResolve() throws ObjectStreamException {
		return instance;
	}
}
