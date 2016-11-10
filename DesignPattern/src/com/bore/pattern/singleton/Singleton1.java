package com.bore.pattern.singleton;

/**
 * @description ����ģʽ  ͨ���ڲ��ഴ�� 
 * @author Pet.Li
 * @date 2016��11��1�� ����5:15:38
 * @version 1.0.0
 */
public class Singleton1 {

	private Singleton1() {
	};

	//�����ʱʱ���̻߳����
	private static class SingletonFactory {
		private static Singleton1 singleton = new Singleton1();
	}

	public static Singleton1 getInstance() {
		return SingletonFactory.singleton;
	}
}
