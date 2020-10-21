package com.hsbc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class Ram{
	
	private String ramType;
	private int ramSize;
	
	
	public String getRamType() {
		return ramType;
	}


	public void setRamType(String ramType) {
		this.ramType = ramType;
	}


	public int getRamSize() {
		return ramSize;
	}


	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}


	public Ram(String ramType, int ramSize) {
		this.ramType = ramType;
		this.ramSize = ramSize;
	}


	public String buildComputer() {
		return this.ramType+this.ramSize;
	}
}
