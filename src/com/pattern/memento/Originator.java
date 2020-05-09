package com.pattern.memento;

/**
 * 發起人角色.內部類實現備忘錄角色
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
		System.out.println("賦值狀態：" + state);
	}

	/**
	 * 工廠方法，返回一個備忘錄對象
	 * 
	 * @return
	 */
	public Memento creatMemento() {
		return new Memento(state);
	}

	/**
	 * 恢復備忘錄狀態
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
