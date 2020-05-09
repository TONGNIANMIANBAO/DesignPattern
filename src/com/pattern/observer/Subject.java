package com.pattern.observer;

/**
 * 被觀察者接口
 * 
 * @author SEN.CHEN
 *
 */
public interface Subject {
	void attach(Observer observer);

	void detach(Observer observer);

	void notifyObserver();

}
