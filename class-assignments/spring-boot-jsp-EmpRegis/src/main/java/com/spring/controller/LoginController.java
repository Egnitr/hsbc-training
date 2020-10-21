package com.spring.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("location")String location,@RequestParam("salary")String salary) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("success");
		HashMap<String,String> data=new HashMap<>();
		data.put("id", id);
		data.put("name", name);
		data.put("location", location);
		data.put("salary", salary);
		mv.addObject("data",data);
		return mv;
	}
}
