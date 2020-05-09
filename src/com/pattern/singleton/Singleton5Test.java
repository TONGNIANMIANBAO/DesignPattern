package com.pattern.singleton;

import java.lang.reflect.Constructor;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Singleton5Test {
	Singleton5 e1;
	Singleton5 e2;

	@BeforeEach
	void setUp() throws Exception {
		e1 = Singleton5.INSTANCE;
		Constructor<Singleton5> con = Singleton5.class.getDeclaredConstructor();
		con.setAccessible(true);
		e2 = con.newInstance();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

	@Test
	void test() {
		Assert.assertEquals(true, e1 == e2);
	}

}
