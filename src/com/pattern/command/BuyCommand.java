package com.pattern.command;

public class BuyCommand implements ICommand {
	Receiver receiver;

	public BuyCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void excute() {
		receiver.buy();
	}

}
