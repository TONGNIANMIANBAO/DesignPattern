package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private String state;
	private List<Observer> list;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		this.notifyObserver();
	}

	public ConcreteSubject() {
		super();
		list = new ArrayList<>();
	}

	@Override
	public void attach(Observer observer) {
		list.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		if (list.size() != 0) {
			list.remove(observer);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o : list) {
			o.update(state);
		}
	}

}
