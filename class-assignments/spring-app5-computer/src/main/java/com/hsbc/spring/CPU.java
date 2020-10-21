package com.hsbc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class CPU {
	private String cpuType;
	private int cpuFrequency;
	
	public CPU(String cpuType, int cpuFrequency) {
		super();
		this.cpuType = cpuType;
		this.cpuFrequency = cpuFrequency;
	}

	public String getCpuType() {
		return cpuType;
	}

	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}

	public int getCpuFrequency() {
		return cpuFrequency;
	}

	public void setCpuFrequency(int cpuFrequency) {
		this.cpuFrequency = cpuFrequency;
	}


	public String buildComputer() {
		return this.cpuType+this.cpuFrequency;
	}
}
