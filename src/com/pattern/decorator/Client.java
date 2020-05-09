package com.pattern.decorator;

/**
 * 裝飾器模式： 用於類增加功能。裝飾類與被裝飾類實現同一個接口， 裝飾對象必需傳入被裝飾對象引用。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {
	public static void main(String[] args) {
		ISource source = new Source();
		ISource decorator = new Decorator(source);
		decorator.print();
	}

}
