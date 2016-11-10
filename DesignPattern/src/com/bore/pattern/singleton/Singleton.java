package com.bore.pattern.singleton;


/**
 * @description 单例模式：1、避免频繁创建和销毁对象；2、节省内存空间
 * @author Pet.Li
 * @date 2016年10月31日 上午10:22:06
 * @version 1.0.0
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized(singleton){
				if(singleton == null){
					singleton = new Singleton();//由于jvm创建对象和赋值是分开的，所以这里会产生线程安全的问题
				}
			}
		}
		return singleton;
	}
}