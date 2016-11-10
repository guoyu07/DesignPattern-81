package com.bore.pattern.factory;

/**
 * @description ����ģʽ ��1����Ҫ����������Ʒ��2����Ʒ������ͬ�ӿ� 
 * @author Pet.Li
 * @date 2016��11��1�� ����3:39:19
 * @version 1.0.0
 */
public class SendFactory {

	public static ISender produceMail() {
		return new MailSender();
	}

	public static ISender produceSMS() {
		return new SMSSender();
	}
	
	public static void main(String[] args) {
		ISender sender = SendFactory.produceMail();
		sender.send();
	}
}
