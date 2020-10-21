package com.demo.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.Entity.Emp;
@Repository
public class EmpDb {

	private static HashMap<Integer, Emp> db=new HashMap<>();
	
	public static HashMap<Integer,Emp> getDb(){
		return db;
	}
	
	public static void setDb() {
		EmpDb.db=db;
	}
	
	public EmpDb() {
		db.put(101,new Emp(101,"Megha", "Agra",67000));
		db.put(102,new Emp(102,"Shikha", "Agra",67000));
		db.put(103,new Emp(103,"Radha", "Agra",67000));
		db.put(104,new Emp(104,"kashish"," Agra",67000));
		db.put(105,new Emp(105,"Misha", "Agra",67000));
		db.put(106,new Emp(106,"kiran", "Agra",67000));
		
	}
	
}
