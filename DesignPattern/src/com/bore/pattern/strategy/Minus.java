package com.bore.pattern.strategy;

/**
 * @description ����ģʽ  ����һϵ���㷨��ʹ���ǿ����໥�滻���㷨�ı䷨��Ӱ���û��ĵ���
 * @author Pet.Li
 * @date 2016��11��4�� ����9:57:47
 * @version 1.0.0
 */
public class Minus extends AbstratCalculator implements ICalculator {

	@Override
	public int calculator(String exp) {
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
