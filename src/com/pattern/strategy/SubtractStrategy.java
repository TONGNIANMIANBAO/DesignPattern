package com.pattern.strategy;

public class SubtractStrategy implements Strategy {

	@Override
	public void doOperation(int a, int b) {
		System.out.println(a - b);
	}

}
