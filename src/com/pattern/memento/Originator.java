package com.pattern.memento;

/**
 * �l���˽�ɫ.�Ȳ���F����䛽�ɫ
 * 
 * @author SEN.CHEN
 *
 */
public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("�xֵ��B��" + state);
	}

	/**
	 * ���S����������һ������䛌���
	 * 
	 * @return
	 */
	public Memento creatMemento() {
		return new Memento(state);
	}

	/**
	 * �֏͂���䛠�B
	 * 
	 * @param me
	 */
	public void restoreMemento(IMemento me) {
		state = ((Memento) me).getState();
	}

	private class Memento implements IMemento {
		private String state;

		public Memento(String state) {
			super();
			this.state = state;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

	}
}
