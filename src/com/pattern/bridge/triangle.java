package com.pattern.bridge;

public class triangle implements IDraw {

	@Override
	public void draw(String color) {
		System.out.println("triangle " + color);
	}

}
