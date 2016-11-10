package com.bore.pattern.factory.test;

import org.junit.Test;

import com.bore.pattern.factory.abstractfactory.IProvider;
import com.bore.pattern.factory.abstractfactory.MailSenderFactory;

public class FactoryTest {

	@Test
	public void createSender() {
		IProvider provider = new MailSenderFactory();
		provider.produce();
	}
}
