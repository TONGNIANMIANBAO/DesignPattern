package com.pattern.memento;

/**
 * �����ģʽ������һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ�����
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
