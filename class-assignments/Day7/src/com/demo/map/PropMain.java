package com.demo.map;

import java.util.Collection;
import java.util.Properties;

public class PropMain {

	public static void main(String[] args) {
		Properties props=System.getProperties();
		//System.out.println(props);
		Collection<Object> values=props.values();
		for(Object s:values) {
			System.out.println(s);
		}

	}

}
