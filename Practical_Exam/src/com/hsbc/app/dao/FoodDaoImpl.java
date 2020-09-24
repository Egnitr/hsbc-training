package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.FoodItems;

public interface FoodDaoImpl {
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<FoodItems> listAll();
	/**
	 * Saving FoodItemstomer
	 * @param c- FoodItemstomer object
	 * @return - Returns a status message
	 */
	public String save(FoodItems c) ;
}
