package com.pattern.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSingleton {

	private Singleton4 s1, s2;
	private Singleton5 e1, e2;

	@BeforeEach
	void setUp() throws Exception {
		s1 = Singleton4.getInstance();
		System.out.println(s1);
		s2 = Singleton4.getInstance();
		System.out.println(s2);
		e1 = Singleton5.INSTANCE;
		System.out.println(e1.hashCode());
		e2 = Singleton5.INSTANCE;
		System.out.println(e2.hashCode());
	}

	@Test
	void test() {
		Assert.assertEquals(true, s1 == s2);
		Assert.assertEquals(true, e1 == e2);
	}

}
