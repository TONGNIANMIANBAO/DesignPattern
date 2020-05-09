package com.pattern.iterator;

/**
 * 迭代器模式：使用内部类来定义迭代器，好处就是可以直接使用外部类的属性
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		ConcreteAggregate agg = new ConcreteAggregate();
		agg.add(234);
		agg.add("ss");
		agg.add(new Boolean("FALSE"));
		for (Iterator it = agg.getIterator(); it.hasNext();) {
			System.out.println(it.getCurrentObject());
			it.next();
		}
	}

}
