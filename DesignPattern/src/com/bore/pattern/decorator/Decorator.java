package com.bore.pattern.decorator;

/**
 * @description 装饰模式 1、给对象添加新的功能，而且是动态；2、要求装饰对象和被装饰对象实现统一接口。
 * @author Pet.Li
 * @date 2016年11月2日 下午3:58:52
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
