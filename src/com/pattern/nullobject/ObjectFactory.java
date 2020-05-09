package com.pattern.nullobject;

import java.util.Arrays;

public class ObjectFactory {
	Integer[] arr = { 1, 2, 3, 4, 5, 7 };

	public IObject creatObject(int id) {
		if (Arrays.asList(arr).contains(id)) {
			return new RealObject();
		}
		return new NullObject();
	}
}
