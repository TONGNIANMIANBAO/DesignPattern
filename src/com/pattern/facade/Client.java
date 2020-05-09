package com.pattern.facade;

/**
 * 外觀模式：降低訪問子系統的複雜度。提供外部訪問系統的接口
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}

}
