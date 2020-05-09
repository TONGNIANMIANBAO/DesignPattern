package com.pattern.filter;

import java.util.List;

public class OrCriteria implements Criteria {
	Criteria first;
	Criteria second;

	public OrCriteria(Criteria first, Criteria second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> fList = first.meetCriteria(persons);
		List<Person> sList = second.meetCriteria(persons);
		for (Person p : sList) {
			if (!fList.contains(p)) {
				fList.add(p);
			}
		}
		return fList;
	}

}
