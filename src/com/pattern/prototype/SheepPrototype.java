package com.pattern.prototype;

import java.util.Date;

public class SheepPrototype implements Cloneable {
	Date birthday = new Date();

	@Override
	public Object clone() throws CloneNotSupportedException {

		Object obj = super.clone();
		// SheepPrototype sheep = (SheepPrototype) obj;
		// sheep.birthday = (Date) this.birthday.clone();
		return obj;
	}

}
