package com.pattern.chainOfResponsibility;

public abstract class Handler {
	Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Handler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Handler(Handler handler) {
		super();
		this.handler = handler;
	}

	public abstract void dealRequest(String request);

}
