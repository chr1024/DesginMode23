package com.cn.factory.general;

public class MailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("this is Mail sender");
	}

}
