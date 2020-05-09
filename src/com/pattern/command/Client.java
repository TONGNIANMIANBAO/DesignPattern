package com.pattern.command;

/**
 * 命令模式：请求以命令的形式包裹在对象中，并传给调用对象。调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		ICommand buy = new BuyCommand(receiver);
		ICommand sell = new SellCommand(receiver);

		Invoker inv = new Invoker();
		inv.addCommands(buy);
		inv.addCommands(sell);
		inv.invokeCommand();

	}

}
