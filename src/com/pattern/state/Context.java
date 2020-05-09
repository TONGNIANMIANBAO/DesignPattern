package com.pattern.state;

/**
 * ­h¾³½ÇÉ«
 * 
 * @author SEN.CHEN
 *
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		this.state.setCtx(this);
	}

	public void open() {
		this.state.open();
	}

	public void close() {
		this.state.close();
	}

	public void run() {
		this.state.run();
	}

	public void stop() {
		this.state.stop();
	}
}
