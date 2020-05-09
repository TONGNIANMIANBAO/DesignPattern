package com.pattern.filter;

import java.util.List;

public class AndCriteria implements Criteria {

	Criteria first;
	Criteria second;

	public AndCriteria(Criteria first, Criteria second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		return first.meetCriteria(second.meetCriteria(persons));
	}

}
