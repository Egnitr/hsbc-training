package com.hsbc.spring;

import org.springframework.stereotype.Repository;

@Repository
public class Storage{
	
	private String storageType;
	private int storageSize;

	public String getStorageType() {
		return storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

	public Storage(String storageType, int storageSize) {
		super();
		this.storageType = storageType;
		this.storageSize = storageSize;
	}

	public String buildComputer() {
		return this.storageType+this.storageSize;
	}
}
