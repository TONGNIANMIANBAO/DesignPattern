package com.pattern.state;

public class StopState extends State {

	@Override
	public void open() {
		ctx.setState(new OpenState());
		ctx.getState().open();
	}

	@Override
	void close() {
		// TODO Auto-generated method stub

	}

	@Override
	void run() {
		ctx.setState(new RunState());
		ctx.getState().run();
	}

	@Override
	void stop() {
		System.out.println("is stop");
	}

}
