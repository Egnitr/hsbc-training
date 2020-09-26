package com.hsbc.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import com.hsbc.app.dao.*;
import java.util.List;
import java.util.Map;

import com.hsbc.app.entity.Cus;

public class CusDb implements com.hsbc.app.dao.CusDao {
	static Map<Integer, Cus> empDB = new HashMap<>();

	public CusDb() {
		empDB.put(100, new Cus(100, "Abhishek", "Monday", 7000));
		empDB.put(101, new Cus(101, "Prateek", "Tuesday", 8000));
		empDB.put(102, new Cus(102, "Nitesh", "Wednesday", 5000));
		empDB.put(103, new Cus(103, "Ranjeet", "Sunday", 5000));
		empDB.put(104, new Cus(104, "Anshaj", "Monday", 6000));

	}

	@Override
	public Cus findById(int id) throws CusNFException {
		try {
			if (empDB.containsKey(id)) {
				return empDB.get(id);
			} else {
				throw new CusNFException();
			}
		} catch (CusNFException ex) {
			throw ex;
		}
	}

	@Override
	public List<Cus> listAll() {

		ArrayList<Cus> empList = new ArrayList(empDB.values());
		return empList;
	}

	@Override
	public String save(Cus e) {
		if (empDB.containsKey(e.getId())) {
			return "Cus already exists";
		} else {
			empDB.put(e.getId(), e);
			return "Cus Registered successfully";
		}

	}
	
	@Override
	public String remove(int i) {
		if (empDB.containsKey(i)) {
			empDB.remove(i);
			return "Customer Deleted";
		} else {
			return "Customer Doesn't Exists!";
		}

	}
}