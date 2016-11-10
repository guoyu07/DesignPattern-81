package com.bore.pattern.proxy;

public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("this is the original method.");
	}

}
