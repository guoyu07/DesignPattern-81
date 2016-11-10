package com.bore.pattern.adapter;

/**
 * @description 类适配模式
 * @author Pet.Li
 * @date 2016年11月2日 下午3:17:15
 * @version 1.0.0
 */
public class Adapter4Class extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method.");
	}

}
