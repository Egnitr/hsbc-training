package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(path="/demo",method=RequestMethod.GET)
	public String getTestPage() {
		System.out.println("From Inside controller");
		return "test";
	}
}
