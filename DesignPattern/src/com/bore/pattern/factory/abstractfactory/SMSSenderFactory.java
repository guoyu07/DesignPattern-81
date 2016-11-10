package com.bore.pattern.factory.abstractfactory;

import com.bore.pattern.factory.ISender;
import com.bore.pattern.factory.SMSSender;

public class SMSSenderFactory implements IProvider {

	@Override
	public ISender produce() {
		return new SMSSender();
	}

}
