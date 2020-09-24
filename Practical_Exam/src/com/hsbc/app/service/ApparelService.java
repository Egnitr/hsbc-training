package com.hsbc.app.service;

import com.hsbc.app.dao.ApparelDaoImpl;
import com.hsbc.app.dao.ItemNFException;
import com.hsbc.app.entity.Apparel;

public class ApparelService {

	private ApparelDaoImpl dao;

	public ApparelService(ApparelDaoImpl dao) {
		this.dao = dao;
	}

	public String registerApparel(int code, String name, String size, String material, int quantity, double price) {
		return dao.save(new Apparel(code, name, size,  material,quantity, price));
	}


	public void printApparelList() {

		for (Apparel e1 : dao.listAll()) {
			System.out.println(e1.getCode() + " " + e1.getName() + " " + e1.getSize() + " " + e1.getMaterial());
		}
	}
}