package com.pattern.composite;

/**
 * 組合模式：樹形結構整合一組相似的對象。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Component composite1 = new ConcreteComponent("concrete composite1");
		Component leaf1 = new LeafComponent1("leaf1");
		Component leaf2 = new LeafComponent2("leaf2");

		Component composite2 = new ConcreteComponent("concrete composite2");
		Component leaf3 = new LeafComponent1("leaf3");
		Component leaf4 = new LeafComponent2("leaf4");

		ConcreteComponent component = new ConcreteComponent("conponent");
		component.add(composite1);
		component.add(composite2);
		composite1.add(leaf4);
		composite1.add(leaf3);
		composite2.add(leaf2);
		composite2.add(leaf1);

		System.out.println(component);
	}

}
