package com.pattern.state;

public class RunState extends State {

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

	@Override
	void close() {
		// TODO Auto-generated method stub

	}

	@Override
	void run() {
		System.out.println("is run");
	}

	@Override
	void stop() {
		ctx.setState(new StopState());
		ctx.getState().stop();
	}

}
