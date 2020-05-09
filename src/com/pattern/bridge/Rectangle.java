package com.pattern.bridge;

public class Rectangle implements IDraw {

	@Override
	public void draw(String color) {
		System.out.println("rectangle " + color);
	}

}
