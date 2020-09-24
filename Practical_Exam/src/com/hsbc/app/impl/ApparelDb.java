package com.hsbc.app.impl;

import java.util.ArrayList;
import java.util.HashMap;
import com.hsbc.app.dao.*;
import java.util.List;
import java.util.Map;

import com.hsbc.app.entity.Apparel;

public class ApparelDb implements com.hsbc.app.dao.ApparelDaoImpl {
	static Map<Integer, Apparel> apparelDB = new HashMap<>();

	public ApparelDb() {
		apparelDB.put(100, new Apparel(100, "Shirt", "Medium", "Cotton",40,2000));
		apparelDB.put(101, new Apparel(101, "Sweater", "Large", "Woolen",70,2000));
		apparelDB.put(102, new Apparel(102, "Jacket", "Small", "Woolen",80,1000));
		apparelDB.put(103, new Apparel(103, "T-Shirt", "Medium", "Cotton",20,600));
		apparelDB.put(104, new Apparel(104, "Trouser", "Large", "Cotton",100,3000));

	}


	@Override
	public List<Apparel> listAll() {

		ArrayList<Apparel> apparelList = new ArrayList(apparelDB.values());
		return apparelList;
	}

	@Override
	public String save(Apparel e) {
		if (apparelDB.containsKey(e.getCode())) {
			return "Apparel already exists";
		} else {
			apparelDB.put(e.getCode(), e);
			return "Apparel Registered successfully";
		}

	}

}