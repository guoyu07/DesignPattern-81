package com.bore.pattern.factory;

public class SMSSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is SMSSender¡£");
	}

}
