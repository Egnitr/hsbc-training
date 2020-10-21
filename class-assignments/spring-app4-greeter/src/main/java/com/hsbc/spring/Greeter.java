package com.hsbc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greeter {
	@Autowired
	Greeting greeting;

	public void greet() {
		System.out.println(greeting.greetMessage());
	}
	
}
