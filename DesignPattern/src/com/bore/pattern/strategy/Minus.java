package com.bore.pattern.strategy;

/**
 * @description 策略模式  定义一系列算法，使他们可以相互替换，算法的变法不影响用户的调用
 * @author Pet.Li
 * @date 2016年11月4日 上午9:57:47
 * @version 1.0.0
 */
public class Minus extends AbstratCalculator implements ICalculator {

	@Override
	public int calculator(String exp) {
		int arrayInt[] = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}

}
