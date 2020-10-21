package com.demo.collection;

import java.util.ArrayList;
public class EmpArray {

	public static void main(String[] args) {
		ArrayList<Emp> e=new ArrayList<>(); 
		Emp e1=new Emp(101,"Abhi","Pune",10000);
		Emp e2=new Emp(102,"Abhi2","Lko",20000);
		Emp e3=new Emp(103,"Abhi3","Delhi",30000);
        e.add(e1);
        e.add(e2);
        e.add(e3);
  
        System.out.println(e); 
        System.out.println("List contains Pune:" + e.contains(e1)); 

        e.remove(e1); 
        System.out.println("List after removing Employee1:"+ e); 

    } 

}
