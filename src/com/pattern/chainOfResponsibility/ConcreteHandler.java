package com.pattern.chainOfResponsibility;

public class ConcreteHandler extends Handler {

	public ConcreteHandler() {
	}

	@Override
	public void dealRequest(String request) {
		if (super.getHandler() == null) {
			System.out.println("deal " + request);
		} else {
			System.out.println("next handler " + request);
			super.getHandler().dealRequest(request);
		}
	}

}
