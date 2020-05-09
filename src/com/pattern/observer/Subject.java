package com.pattern.observer;

/**
 * ���^���߽ӿ�
 * 
 * @author SEN.CHEN
 *
 */
public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObserver();

}
