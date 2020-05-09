package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	ICommand command;
	List<ICommand> cList = new ArrayList<>();

	public void addCommands(ICommand command) {
		cList.add(command);
	}

	public void invokeCommand() {
		for (ICommand c : cList) {
			c.excute();
		}
		cList.clear();
	}
}
