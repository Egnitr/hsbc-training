package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Singer implements Performer {
	
	//@Autowired
	//Audience audience;
	@Override
	public void perform() {
		//audience.takeSeat();
		//audience.switchOffMobile();
		System.out.println("Singing is now singing...");
		//audience.applaud();
	}

}
