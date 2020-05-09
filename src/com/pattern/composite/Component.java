package com.pattern.composite;

public abstract class Component {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Component(String name) {
		super();
		this.name = name;
	}

	public abstract void add(Component component);

	public abstract void remove(Component component);

	@Override
	public String toString() {
		return "Component [name=" + name + "]";
	}

}
