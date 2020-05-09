package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteComponent extends Component {
	private String name;
	private List<Component> components;

	public ConcreteComponent(String name) {
		super(name);
		this.name = name;
		components = new ArrayList<>();
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	@Override
	public void add(Component component) {
		components.add(component);
	}

	@Override
	public void remove(Component component) {
		components.remove(component);
	}

	@Override
	public String toString() {
		return "ConcreteComponent [name=" + name + ", components=" + components + "]";
	}

}
