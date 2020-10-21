package com.hsbc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class GoodMorning implements Greeting{
	
	@Override
	public String greetMessage() {
		return "Good Morning";
	}
}
