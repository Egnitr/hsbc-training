package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String,String> sc=new HashMap<>();
		sc.put("UP", "Lucknow");
		sc.put("MP", "Bhopal");
		sc.put("MH", "Mumbai");
		sc.put("Goa", "Panaji");
		System.out.println(sc.get("UP"));
		Collection<String> values=sc.values();
		for(String s:values) {
			System.out.println(s);
		}
		Set<String> keySet=sc.keySet();
		//Iterator<String> i = sc.iterator(); 
        //while (i.hasNext()) {
        //	String key=i.next();
        //    System.out.println(key+sc.get(key)); 
       // }
	}

}
