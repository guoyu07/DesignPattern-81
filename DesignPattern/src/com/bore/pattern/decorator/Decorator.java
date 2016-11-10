package com.bore.pattern.decorator;

/**
 * @description װ��ģʽ 1������������µĹ��ܣ������Ƕ�̬��2��Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͳһ�ӿڡ�
 * @author Pet.Li
 * @date 2016��11��2�� ����3:58:52
 * @version 1.0.0
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method1() {

		System.out.println("befor decorator.");
		source.method1();
		System.out.println("after decorator.");
	}
	
}
