package com.spring.data;

import java.util.HashMap;

import org.springframework.stereotype.Repository;
@Repository
public class EmpDb {
	private static HashMap<Integer,Emp> db=new HashMap<>();
	
	public static void setDb(HashMap<Integer,Emp> db) {
		EmpDb.db=db;
	}
	public EmpDb() {
		db.put(100,new Emp(100,"Shantanu","Pune",10000));
	}
	public HashMap<Integer,Emp> getDb() {
		return db;
	}
}
