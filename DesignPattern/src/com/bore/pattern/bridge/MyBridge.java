package com.bore.pattern.bridge;

/**
 * @description 桥接模式  将抽象化与实现化解耦，使得两者可以独立变化
 * @author Pet.Li
 * @date 2016年11月3日 下午3:34:29
 * @version 1.0.0
 */
public class MyBridge extends Bridge{
	
	public void method(){
		getSource().method();
	}
	
	public static void main(String[] args) {
		//第一个对象
		Bridge bridge = new MyBridge();
		Sourceable source1 = new Source1();
		bridge.setSource(source1);
		bridge.method();
	}
}
