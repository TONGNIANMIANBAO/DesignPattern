package com.pattern.iterator;

public interface Iterator {
	void first();

	void next();

	boolean hasNext();

	Object getCurrentObject();
}
