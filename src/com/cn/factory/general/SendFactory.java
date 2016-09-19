package com.cn.factory.general;

public class SendFactory {
	public Sender product(String name){
		if("mail".equals(name)){
			return new MailSender();
		}else if ("sms".equals(name)) {
			return new SmsSender();
		}else {
			System.out.println("请输入正确的类型：mial || sms");
			return null;
		}
	}
}
