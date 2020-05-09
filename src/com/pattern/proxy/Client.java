package com.pattern.proxy;

/**
 * 代理模式：用於隔離。代理類內部持有一個被代理對象
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.print();
	}
}
