package com.pattern.bridge;

public abstract class Colors {
	IDraw drawImp;

	public Colors(IDraw drawImp) {
		super();
		this.drawImp = drawImp;
	}

	public IDraw getDrawImp() {
		return drawImp;
	}

	public void setDrawImp(IDraw drawImp) {
		this.drawImp = drawImp;
	}

	public void print(String color) {
		drawImp.draw(color);
	};
}
