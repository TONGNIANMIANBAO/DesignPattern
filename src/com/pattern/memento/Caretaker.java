package com.pattern.memento;

/**
 * 管理人角色
 * 
 * @author SEN.CHEN
 *
 */
public class Caretaker {
	private IMemento memento;

	/**
	 * 備忘錄取值
	 * 
	 * @return
	 */
	public IMemento getMemento() {
		return memento;
	}

	/**
	 * 備忘錄賦值
	 * 
	 * @param memento
	 */
	public void setMemento(IMemento memento) {
		this.memento = memento;
	}

}
