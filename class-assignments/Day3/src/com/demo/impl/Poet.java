package com.demo.impl;

import com.demo.interfaces.*;
public class Poet implements Writer {

	@Override
	public String write() {
		return "Take Rest Mr. Poet";
	}

	@Override
	public int salary() {
		return 20000;
	}

}
