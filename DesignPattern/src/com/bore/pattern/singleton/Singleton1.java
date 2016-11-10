package com.bore.pattern.singleton;

/**
 * @description 单例模式  通过内部类创建 
 * @author Pet.Li
 * @date 2016年11月1日 下午5:15:38
 * @version 1.0.0
 */
public class Singleton1 {

	private Singleton1() {
	};

	//类加载时时是线程互斥的
	private static class SingletonFactory {
		private static Singleton1 singleton = new Singleton1();
	}

	public static Singleton1 getInstance() {
		return SingletonFactory.singleton;
	}
}
