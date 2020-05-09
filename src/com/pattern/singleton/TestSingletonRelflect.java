package com.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingletonRelflect {

	public static void main(String[] args) {
		try {

			Singleton4 s4, s, sn;
			// ··Õ®ﬂ^∑¥…‰´@µ√åç¿˝ï˛àÛÂe
			Constructor<Singleton4> con = Singleton4.class.getDeclaredConstructor();
			con.setAccessible(true);
			s4 = con.newInstance();
			System.out.println("s4: " + s4.hashCode());

			s = Singleton4.getInstance();
			System.out.println("s: " + s.hashCode());
			sn = Singleton4.getInstance();
			System.out.println("sn: " + sn.hashCode());

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
