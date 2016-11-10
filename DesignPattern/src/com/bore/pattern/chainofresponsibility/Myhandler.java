package com.bore.pattern.chainofresponsibility;

/**
 * @description ������ģʽ �ж������ÿ�����󶼳�����һ����������ã��������������ϴ��ݣ�ֱ��ĳ���������������
 * @author Pet.Li
 * @date 2016��11��6�� ����11:29:30
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
