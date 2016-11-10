package com.bore.pattern.factory.abstractfactory;

import com.bore.pattern.factory.ISender;
import com.bore.pattern.factory.MailSender;

public class MailSenderFactory implements IProvider {

	@Override
	public ISender produce() {
		return new MailSender();
	}

}
