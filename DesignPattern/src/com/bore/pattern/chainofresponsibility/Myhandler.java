package com.bore.pattern.chainofresponsibility;

/**
 * @description 责任链模式 有多个对象，每个对象都持有下一个对象的引用，请求在这条链上传递，直到某个对象处理这个请求
 * @author Pet.Li
 * @date 2016年11月6日 上午11:29:30
 * @version 1.0.0
 */
public class Myhandler extends AbstractHandler implements Handler {

	private String name;

	public Myhandler(String name) {
		this.name = name;
	}

	@Override
	public void operator() {

		System.out.println(name + "deal");
		if (getHandle() != null) {
			getHandle().operator();
		}
	}

	public static void main(String[] args) {

		Myhandler h1 = new Myhandler("h1");
		Myhandler h2 = new Myhandler("h2");
		Myhandler h3 = new Myhandler("h3");

		h1.setHandle(h2);
		h2.setHandle(h3);

		h1.operator();

	}
}
