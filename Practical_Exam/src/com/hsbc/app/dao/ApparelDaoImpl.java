package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Apparel;

public interface ApparelDaoImpl {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws FoodNFException
	 */
	public Apparel findById(int id) throws ItemNFException;
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<Apparel> listAll();
	/**
	 * Saving Appareltomer
	 * @param c- Appareltomer object
	 * @return - Returns a status message
	 */
	public String save(Apparel c) ;
}

