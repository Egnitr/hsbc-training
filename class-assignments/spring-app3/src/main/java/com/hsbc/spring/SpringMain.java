package com.hsbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsbc.spring.entity.Emp;
import com.hsbc.spring.service.EmpService;

public class SpringMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService service=(EmpService)ctx.getBean("empService");
		System.out.println(service.registerEmp(100,"aa","aaaa",100));
	}

}
