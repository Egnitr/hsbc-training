package com.hsbc.spring;

public class NoSpringMain {

	public static void main(String[] args) {
		Message message=new Message();
		message.setHeader("Lunch Break");
		message.setBody("Not happening");
		Mail mail=new Mail();
		mail.setFromAddress("trainer@gmail.com");
		mail.setToAddress("you@gmail.com");
		mail.setMessage(message);
		
		System.out.println(mail.getMessage().getBody());
	}

}
