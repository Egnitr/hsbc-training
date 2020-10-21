package com.hsbc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Computer {
	@Autowired
	private Ram ram;
	@Autowired
	private Storage storage;
	@Autowired
	private Display display;
	@Autowired
	private CPU cpu;
	
	public String buildComputer() {
		return ram.buildComputer()+cpu.buildComputer()+display.buildComputer()+storage.buildComputer();
	}
	
}
