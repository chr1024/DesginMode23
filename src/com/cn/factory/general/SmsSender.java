package com.cn.factory.general;

public class SmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("this is Sms sender");
	}

}
