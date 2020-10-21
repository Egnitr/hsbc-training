package com.hsbc.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.entity.Emp;

public class EmpDb implements EmpDao {
	static Map<Integer, Emp> empDB = new HashMap<>();

	public EmpDb() {
		empDB.put(100, new Emp(100, "Shantanu", "Hyderabad", 70000));
		empDB.put(101, new Emp(101, "Arun", "Chennai", 80000));
		empDB.put(102, new Emp(102, "Pavan", "Hyderabad", 50000));
		empDB.put(103, new Emp(103, "Kiran", "Bangalore", 50000));
		empDB.put(104, new Emp(104, "Raja", "Chennai", 60000));

	}

	@Override
	public String save(Emp e) {
		if (empDB.containsKey(e.getId())) {
			return "Emp already exists";
		} else {
			empDB.put(e.getId(), e);
			return "Emp Registered successfully";
		}

	}
}