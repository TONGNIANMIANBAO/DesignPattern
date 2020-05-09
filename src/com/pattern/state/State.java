package com.pattern.state;

public abstract class State {
	public Context ctx;

	public Context getCtx() {
		return ctx;
	}

	public void setCtx(Context ctx) {
		this.ctx = ctx;
	}

	public abstract void open();

	abstract void close();

	abstract void run();

	abstract void stop();
}
