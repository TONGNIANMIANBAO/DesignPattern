package com.pattern.template;

/**
 * 模版方法模式：定义一个操作中算法的骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Template a = new ConcreteA();
		a.operation();

		Template b = new ConcreteB();
		b.operation();
	}

}
