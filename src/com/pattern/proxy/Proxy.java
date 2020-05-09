package com.pattern.proxy;

public class Proxy implements ISource {
	ISource source;

	public Proxy() {
		super();
		source = new Source();
	}

	@Override
	public void print() {
		System.out.println("proxy £º");
		source.print();
	}

}
