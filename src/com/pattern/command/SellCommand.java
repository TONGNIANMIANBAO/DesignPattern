package com.pattern.command;

public class SellCommand implements ICommand {
	Receiver receiver;

	public SellCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void excute() {
		receiver.sell();
	}

}
