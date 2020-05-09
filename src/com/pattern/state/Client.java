package com.pattern.state;

/**
 * ��Bģʽ������������ڲ�״̬�����ı�ʱ�ı�������Ϊ���������������޸��������ࡣ
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
