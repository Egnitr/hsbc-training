package com.demo.io.ser;

import java.io.Serializable;

public class Emp implements Serializable {
	int id;
	double sal;
	String name;
	String city;
	public Emp(int id, String name, String city ,double sal) {
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
