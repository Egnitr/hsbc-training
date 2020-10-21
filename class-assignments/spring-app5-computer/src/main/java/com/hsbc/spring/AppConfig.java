package com.hsbc.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.hsbc.spring")
public class AppConfig {
	@Bean
	public Ram ram() {
		Ram ram=new Ram("DDR4", 16);
		return ram;
	}
	
	@Bean
	public Storage storage() {
		Storage storage=new Storage("DDR4", 16);
		return storage;
	}
	
	@Bean
	public Display display() {
		Display display=new Display("ss", "16","HD");
		return display;
	}
	
	@Bean
	public CPU cpu() {
		CPU cpu=new CPU("Intel", 4);
		return cpu;
	}
}
