package com.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> list = new ArrayList<>();
		for (Person p : persons) {
			if (("FEMALE").equalsIgnoreCase(p.getGender())) {
				list.add(p);
			}
		}
		return list;
	}

}
