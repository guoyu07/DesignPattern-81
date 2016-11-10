package com.bore.pattern.factory;

public class MailSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is MailSender.");
	}

}
