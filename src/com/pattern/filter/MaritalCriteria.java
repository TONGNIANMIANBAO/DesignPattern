package com.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class MaritalCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<>();
		for (Person p : persons) {
			if (("Y").equalsIgnoreCase(p.getMaritalStatus())) {
				list.add(p);
			}
		}
		return list;
	}

}
