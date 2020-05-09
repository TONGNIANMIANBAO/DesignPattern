package com.pattern.adapter;

/**
 * 適配器模式： 用於兼容。類適配器繼承Adaptee。對象適配器不繼承Adaptee，只持有該對象。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		System.out.println(adapter.writer());
		adapter.print();

		AdapterObj obj = new AdapterObj(new Adaptee());
		System.out.println(obj.writer());
		obj.print();
	}

}
