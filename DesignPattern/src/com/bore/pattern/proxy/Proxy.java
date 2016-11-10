package com.bore.pattern.proxy;

/**
 * @description ����ģʽ  �ɴ�������ԭ����ʵ�ֹ���
 * @author Pet.Li
 * @date 2016��11��2�� ����7:38:33
 * @version 1.0.0
 */
public class Proxy implements Sourceable{

	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	private void before(){
		System.out.println("before proxy");
	}

	private void after(){
		System.out.println("after proxy");
	}
}
