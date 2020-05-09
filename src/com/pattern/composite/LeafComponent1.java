package com.pattern.composite;

public class LeafComponent1 extends Component {

	public LeafComponent1(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println(this.getName());
	}

}
