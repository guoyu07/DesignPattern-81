package com.bore.pattern.factory;

/**
 * @description 工厂模式 ：1、需要大量创建产品；2、产品具有相同接口 
 * @author Pet.Li
 * @date 2016年11月1日 下午3:39:19
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
