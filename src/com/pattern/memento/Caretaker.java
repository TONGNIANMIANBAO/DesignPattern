package com.pattern.memento;

/**
 * �����˽�ɫ
 * 
 * @author SEN.CHEN
 *
 */
public class Caretaker {
	private IMemento memento;

	/**
	 * �����ȡֵ
	 * 
	 * @return
	 */
	public IMemento getMemento() {
		return memento;
	}

	/**
	 * ������xֵ
	 * 
	 * @param memento
	 */
	public void setMemento(IMemento memento) {
		this.memento = memento;
	}

}
