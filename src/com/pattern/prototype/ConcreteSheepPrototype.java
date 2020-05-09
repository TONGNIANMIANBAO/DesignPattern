package com.pattern.prototype;

import java.util.Date;

public class ConcreteSheepPrototype extends SheepPrototype {
	String name;
	Date birthday;

	public ConcreteSheepPrototype(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void show() {
		System.out.println("åç¨F¡Àclone");
	}
}
