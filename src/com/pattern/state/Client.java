package com.pattern.state;

/**
 * 狀態模式：允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Context ctx = new Context();
		State state = new StopState();
		ctx.setState(state);
		System.out.println("1");
		ctx.run();
		System.out.println("2");
		ctx.open();
		System.out.println("3");
		ctx.close();
		System.out.println("4");
		ctx.stop();
		System.out.println("5");

	}

}
