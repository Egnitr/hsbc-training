package com.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Before("execution(* com.spring.Performer.perform(..))")
	public void takeSeat() {
		System.out.println("Audience taking seats..");
	}
	
	@Before("execution(* com.spring.Performer.perform(..))")
	public void applaud() {
		System.out.println("Clap Clap Clap");
	}
	
	@AfterReturning("execution(* com.spring.Performer.perform(..))")
	public void switchOffMobile() {
		System.out.println("Audience switched off their mobiles");
	}
}
