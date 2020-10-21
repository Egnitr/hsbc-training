package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Computer computer=(Computer) ctx.getBean(Computer.class);
		
		computer.buildComputer();
	}

}
