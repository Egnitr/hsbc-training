package com.hsbc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class Display{
	private String displayType;
	private String displayMemory;
	private String resolution;
	
	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getDisplayMemory() {
		return displayMemory;
	}

	public void setDisplayMemory(String displayMemory) {
		this.displayMemory = displayMemory;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public Display(String displayType, String displayMemory, String resolution) {
		super();
		this.displayType = displayType;
		this.displayMemory = displayMemory;
		this.resolution = resolution;
	}

	public String buildComputer() {
		return this.displayMemory+this.displayType+this.resolution;
	}
}
