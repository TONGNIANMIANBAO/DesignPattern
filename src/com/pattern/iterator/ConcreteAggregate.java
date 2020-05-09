package com.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<>();

	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public Iterator getIterator() {
		return new ConcreteIterator();
	}

	public class ConcreteIterator implements Iterator {
		int cursor;

		@Override
		public void first() {
			cursor = 0;
		}

		@Override
		public void next() {
			cursor++;
		}

		@Override
		public boolean hasNext() {
			if (cursor < list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object getCurrentObject() {
			return list.get(cursor);
		}

	}

}
