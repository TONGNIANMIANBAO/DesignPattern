package com.pattern.composite;

public class LeafComponent2 extends Component {

	public LeafComponent2(String name) {
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

	public void writer() {
		System.out.println(this.getName());
	}
}
