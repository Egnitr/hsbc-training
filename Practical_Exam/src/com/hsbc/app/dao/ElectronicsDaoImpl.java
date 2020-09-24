package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Electronics;

public interface ElectronicsDaoImpl {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws FoodNFException
	 */
	public Electronics findById(int id) throws ItemNFException;
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<Electronics> listAll();
	/**
	 * Saving Electronicstomer
	 * @param c- Electronicstomer object
	 * @return - Returns a status message
	 */
	public String save(Electronics c) ;
}

