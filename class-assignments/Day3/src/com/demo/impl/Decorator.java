package com.demo.impl;

import com.demo.interfaces.*;
public class Decorator implements Writer {

	@Override
	public String write() {
		return "Beautifully designed!";
	}

	@Override
	public int salary() {
		return 60000;
	}

}
