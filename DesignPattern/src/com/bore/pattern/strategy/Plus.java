package com.bore.pattern.strategy;

public class Plus extends AbstratCalculator implements ICalculator {

	@Override
	public int calculator(String exp) {
		int arrayInt[] = split(exp, "\\+");
		return arrayInt[0] + arrayInt[1];
	}

}
