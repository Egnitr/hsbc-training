package com.hsbc.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import com.hsbc.app.dao.*;
import java.util.List;
import java.util.Map;

import com.hsbc.app.entity.Electronics;

public class ElectronicsDb implements com.hsbc.app.dao.ElectronicsDaoImpl {
	static Map<Integer, Electronics> electronicsDB = new HashMap<>();

	public ElectronicsDb() {
		electronicsDB.put(100, new Electronics(100, "TV", 12,60,20000));
		electronicsDB.put(100, new Electronics(101, "Mobile", 24,70,10000));
		electronicsDB.put(100, new Electronics(102, "Watch", 24,80,1000));
		electronicsDB.put(100, new Electronics(103, "Laptop",12,100,30000));
		electronicsDB.put(100, new Electronics(104, "Powerbank", 15,100,3000));

	}

	@Override
	public Electronics findById(int id) throws ItemNFException {
		try {
			if (electronicsDB.containsKey(id)) {
				return electronicsDB.get(id);
			} else {
				throw new ItemNFException();
			}
		} catch (ItemNFException ex) {
			throw ex;
		}
	}

	@Override
	public List<Electronics> listAll() {

		ArrayList<Electronics> foodList = new ArrayList(electronicsDB.values());
		return foodList;
	}

	@Override
	public String save(Electronics e) {
		if (electronicsDB.containsKey(e.getCode())) {
			return "Electronics already exists";
		} else {
			electronicsDB.put(e.getCode(), e);
			return "Electronics Registered successfully";
		}

	}

}