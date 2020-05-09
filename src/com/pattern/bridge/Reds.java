package com.pattern.bridge;

public class Reds extends Colors {

	public Reds(IDraw drawImp) {
		super(drawImp);
	}

	@Override
	public void print(String color) {
		// TODO Auto-generated method stub
		super.print(color);
	}
}
