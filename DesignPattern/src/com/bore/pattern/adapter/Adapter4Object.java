package com.bore.pattern.adapter;

/**
 * @description 对象适配模式    
 * @author Pet.Li
 * @date 2016年11月2日 下午3:24:58
 * @version 1.0.0
 */
public class Adapter4Object implements Targetable {

	private Source source;
	
	public Adapter4Object(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("this is the targetable method.");
	}

}
