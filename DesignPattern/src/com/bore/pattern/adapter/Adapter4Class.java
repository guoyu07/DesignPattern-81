package com.bore.pattern.adapter;

/**
 * @description ������ģʽ
 * @author Pet.Li
 * @date 2016��11��2�� ����3:17:15
 * @version 1.0.0
 */
public class Adapter4Class extends Source implements Targetable{

	@Override
	public void method2() {
		System.out.println("this is the targetable method.");
	}

}
