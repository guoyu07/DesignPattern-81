package com.bore.pattern.template;

/**
 * @description 模板模式  一个抽象类中，定义一个主方法，再定义n个方法，可以是抽象也可以是具体的。定义一个类，继承抽象类型，重写抽象方法，实现对子类的调用
 * @author Pet.Li
 * @date 2016年11月4日 上午11:12:09
 * @version 1.0.0
 */
public abstract class AbstractCalculator {

	//子类实现的方法
	public abstract int calculate(int num1, int num2);
	
	//主方法，实现对本类其他方法的调用，一般是不会变，所有有了final
	public final int calculate(String exp, String opt){
		int arrayInt[] = split(exp, opt);
		return calculate(arrayInt[0], arrayInt[1]);
	}
	
	public int[] split(String exp, String opt) {
		String array[] = exp.split(opt);
		int arrayInt[] = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}

}
