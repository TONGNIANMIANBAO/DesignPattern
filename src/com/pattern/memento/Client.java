package com.pattern.memento;

/**
 * 備忘錄模式：保存一个对象的某个状态，以便在适当的时候恢复对象。
 * 
 * @author SEN.CHEN
 *
 */
public class Client {

	public static void main(String[] args) {
		Originator otr = new Originator();
		otr.setState("first");

		Caretaker tk = new Caretaker();
		tk.setMemento(otr.creatMemento());

		otr.setState("second");
		System.out.println(otr.getState());

		otr.restoreMemento(tk.getMemento());
		System.out.println(otr.getState());
	}

}
