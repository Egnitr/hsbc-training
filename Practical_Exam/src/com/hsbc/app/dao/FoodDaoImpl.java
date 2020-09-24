package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.FoodItems;

public interface FoodDaoImpl {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws FoodNFException
	 */
	public FoodItems findById(int id) throws ItemNFException;
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
