package com.bore.pattern.singleton;


/**
 * @description ����ģʽ��1������Ƶ�����������ٶ���2����ʡ�ڴ�ռ�
 * @author Pet.Li
 * @date 2016��10��31�� ����10:22:06
 * @version 1.0.0
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized(singleton){
				if(singleton == null){
					singleton = new Singleton();//����jvm��������͸�ֵ�Ƿֿ��ģ��������������̰߳�ȫ������
				}
			}
		}
		return singleton;
	}
}