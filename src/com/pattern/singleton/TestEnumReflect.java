package com.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestEnumReflect {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Singleton5> con = Singleton5.class.getDeclaredConstructor();// 枚舉不能反射獲得實例
		con.setAccessible(true);
		Singleton5 single = con.newInstance();
		System.out.println(single.print());
	}

}
