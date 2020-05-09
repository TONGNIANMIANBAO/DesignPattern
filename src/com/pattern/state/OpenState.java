package com.pattern.state;

public class OpenState extends State {

	@Override
	public void open() {
		System.out.println("is open");
	}

	@Override
	public void close() {
		ctx.setState(new CloseState());
		ctx.getState().close();
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
