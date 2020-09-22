package com.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		cities.add("Pune");
		cities.add("Lko");
		cities.add(1,"Mumbai");
		
		System.out.println(cities);
		Collections.sort(cities,new MyListSorter());
		System.out.println(cities);
		Collections.sort(cities);
		System.out.println(cities);
	}

}
class MyListSorter implements Comparator<String>{
	public int compare(String o1,String o2) {
		return o2.compareTo(o1);
	}
}