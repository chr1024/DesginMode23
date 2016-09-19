package com.cn.factory.general;

public class Test {
 public static void main(String[] args) {
	SendFactory factory= new SendFactory();
	Sender sms= factory.product("sms");
	sms.sender();
}
}
