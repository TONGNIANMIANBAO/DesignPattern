package com.pattern.adapter;

/**
 * ��m����
 * 
 * @author SEN.CHEN
 *
 */
public class Adapter extends Adaptee implements ITarget {

	@Override
	public String writer() {
		return "is adapter";
	}

}
