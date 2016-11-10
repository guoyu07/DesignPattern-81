package com.bore.pattern.factory.abstractfactory;

import com.bore.pattern.factory.ISender;

public interface IProvider {
	
	public ISender produce();

}
