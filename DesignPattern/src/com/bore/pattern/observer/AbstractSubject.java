package com.bore.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description 观察者模式   当一个对象发生变化时，其他依赖此对象的对象都会收到通知
 * @author Pet.Li
 * @date 2016年11月6日 上午9:43:08
 * @version 1.0.0
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<>();
	
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObserver() {
		Enumeration<Observer> enumo = vector.elements();
		while (enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}

}
