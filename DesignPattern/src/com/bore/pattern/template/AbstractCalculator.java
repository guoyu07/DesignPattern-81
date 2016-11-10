package com.bore.pattern.template;

/**
 * @description ģ��ģʽ  һ���������У�����һ�����������ٶ���n�������������ǳ���Ҳ�����Ǿ���ġ�����һ���࣬�̳г������ͣ���д���󷽷���ʵ�ֶ�����ĵ���
 * @author Pet.Li
 * @date 2016��11��4�� ����11:12:09
 * @version 1.0.0
 */
public abstract class AbstractCalculator {

	//����ʵ�ֵķ���
	public abstract int calculate(int num1, int num2);
	
	//��������ʵ�ֶԱ������������ĵ��ã�һ���ǲ���䣬��������final
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
