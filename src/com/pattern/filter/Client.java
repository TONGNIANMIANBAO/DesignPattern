package com.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 過濾器模式：不同標準以解耦的方式連接起來
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Criteria first = new FemaleCriteria();
		Criteria second = new MaleCriteria();
		Criteria third = new MaritalCriteria();
		AndCriteria aCriteria = new AndCriteria(first, third);
		OrCriteria oCriteria = new OrCriteria(first, third);

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Y"));
		persons.add(new Person("Laura", "Female", "Y"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Y"));
		persons.add(new Person("Bobby", "Male", "Single"));

		System.out.println("female: ");
		first.meetCriteria(persons).forEach(e -> printPerson(e));
		System.out.println("male: ");
		second.meetCriteria(persons).forEach(e -> printPerson(e));
		System.out.println("marital: ");
		third.meetCriteria(persons).forEach(e -> printPerson(e));
		System.out.println("marital female: ");
		aCriteria.meetCriteria(persons).forEach(e -> printPerson(e));
		System.out.println("marital or female: ");
		oCriteria.meetCriteria(persons).forEach(e -> printPerson(e));

	}

	public static void printPerson(Person person) {
		System.out.println(person.getName() + " " + person.getGender() + " " + person.getMaritalStatus());

	}

}
