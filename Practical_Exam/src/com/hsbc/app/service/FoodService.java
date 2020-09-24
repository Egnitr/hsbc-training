package com.hsbc.app.service;

import com.hsbc.app.dao.FoodDaoImpl;
import com.hsbc.app.dao.ItemNFException;
import com.hsbc.app.entity.FoodItems;

public class FoodService {

	private FoodDaoImpl dao;

	public FoodService(FoodDaoImpl dao) {
		this.dao = dao;
	}

	public String registerFood(int code, String name, String manufactureDate, String expiryDate, String veg, int quantity,double price) {
		return dao.save(new FoodItems(code,name,manufactureDate,expiryDate, veg,quantity,price));
	}

	public String getFoodDetails(int id) {

		try {
			FoodItems e = dao.findById(id);

			return e.getCode() + " " + e.getName() + " " + e.getQuantity() + " " + e.getVeg();
		} catch (ItemNFException ex) {
			throw new RuntimeException("Item Not found");
		}
	}

	public void printFoodList() {

		for (FoodItems e1 : dao.listAll()) {
			System.out.println(e1.getCode() + " " + e1.getName() + " " + e1.getQuantity() + " " + e1.getVeg());
		}
	}
}