package com.pattern.strategy;

/**
 * ����ģʽ��һ�������Ϊ�����㷨����������ʱ���ġ�
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

