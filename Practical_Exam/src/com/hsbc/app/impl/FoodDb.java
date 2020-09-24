package com.hsbc.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import com.hsbc.app.dao.*;
import java.util.List;
import java.util.Map;

import com.hsbc.app.entity.FoodItems;

public class FoodDb implements com.hsbc.app.dao.FoodDaoImpl {
	static Map<Integer, FoodItems> foodDB = new HashMap<>();

	public FoodDb() {
		foodDB.put(100, new FoodItems(100, "Milk", "07/09/2020", "10/09/2020","Yes",40,20));
		foodDB.put(100, new FoodItems(101, "Bread", "18/09/2020", "20/09/2020","Yes",70,20));
		foodDB.put(100, new FoodItems(102, "Butter", "27/08/2020", "15/09/2020","Yes",80,10));
		foodDB.put(100, new FoodItems(103, "Jam", "05/07/2020", "10/10/2020","Yes",20,60));
		foodDB.put(100, new FoodItems(104, "Chocolate", "07/09/2020", "10/11/2020","No",100,30));

	}

	@Override
	public FoodItems findById(int id) throws ItemNFException {
		try {
			if (foodDB.containsKey(id)) {
				return foodDB.get(id);
			} else {
				throw new ItemNFException();
			}
		} catch (ItemNFException ex) {
			throw ex;
		}
	}

	@Override
	public List<FoodItems> listAll() {

		ArrayList<FoodItems> foodList = new ArrayList(foodDB.values());
		return foodList;
	}

	@Override
	public String save(FoodItems e) {
		if (foodDB.containsKey(e.getCode())) {
			return "FoodItems already exists";
		} else {
			foodDB.put(e.getCode(), e);
			return "Food Item Registered successfully";
		}

	}

}