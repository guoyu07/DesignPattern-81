package com.bore.pattern.chainofresponsibility;

public abstract class AbstractHandler {

	private Handler handle;

	public Handler getHandle() {
		return handle;
	}

	public void setHandle(Handler handle) {
		this.handle = handle;
	}
	
}
