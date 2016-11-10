package com.bore.pattern.bridge;

/**
 * @description �Ž�ģʽ  ��������ʵ�ֻ����ʹ�����߿��Զ����仯
 * @author Pet.Li
 * @date 2016��11��3�� ����3:34:29
 * @version 1.0.0
 */
public class MyBridge extends Bridge{
	
	public void method(){
		getSource().method();
	}
	
	public static void main(String[] args) {
		//��һ������
		Bridge bridge = new MyBridge();
		Sourceable source1 = new Source1();
		bridge.setSource(source1);
		bridge.method();
	}
}
