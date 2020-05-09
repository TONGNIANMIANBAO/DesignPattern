package com.pattern.state;

public class CloseState extends State {

	@Override
	public void open() {
		ctx.setState(new OpenState());
		ctx.getState().open();
	}

	@Override
	public void close() {
		System.out.println("is close");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
