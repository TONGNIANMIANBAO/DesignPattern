package com.pattern.strategy;

/**
 * 策略模式：一个类的行为或其算法可以在运行时更改。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Context ctx = new Context(new AddStrategy());
		ctx.excuteStrategy(2, 7);

		ctx.setStrategy(new SubtractStrategy());
		ctx.excuteStrategy(2, 7);
	}
}

