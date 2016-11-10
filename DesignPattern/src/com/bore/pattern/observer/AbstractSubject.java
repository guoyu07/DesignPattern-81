package com.bore.pattern.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description �۲���ģʽ   ��һ���������仯ʱ�����������˶���Ķ��󶼻��յ�֪ͨ
 * @author Pet.Li
 * @date 2016��11��6�� ����9:43:08
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
