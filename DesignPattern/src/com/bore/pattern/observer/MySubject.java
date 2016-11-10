package com.bore.pattern.observer;

public class MySubject extends AbstractSubject{

	@Override
	public void operation() {
		System.out.println("update self");
		notifyObserver();
	}
}