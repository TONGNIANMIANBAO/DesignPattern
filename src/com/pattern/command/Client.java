package com.pattern.command;

/**
 * ����ģʽ���������������ʽ�����ڶ����У����������ö��󡣵��ö���Ѱ�ҿ��Դ��������ĺ��ʵĶ��󣬲��Ѹ��������Ӧ�Ķ��󣬸ö���ִ�����
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
