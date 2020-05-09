package com.pattern.template;

public abstract class Template {
	public final void step() {
		System.out.println(this.getClass().getName());
	}

	public abstract void step2();

	public abstract void step3();

	public void operation() {
		step();
		step2();
		step3();
	}
}
