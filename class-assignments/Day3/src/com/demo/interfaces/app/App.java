package com.demo.interfaces.app;

import com.demo.interfaces.*;
import com.demo.impl.*;
public class App {

	public static void main(String[] args) {
		String writerType="D";
		if(writerType.equals("P")) {
			Writer w=new Poet();
			System.out.println(w.write());
			System.out.println(w.salary());
		}
		if(writerType.equals("D")) {
			Writer w=new Decorator();
			System.out.println(w.write());
			System.out.println(w.salary());
		}
		
	}

}
