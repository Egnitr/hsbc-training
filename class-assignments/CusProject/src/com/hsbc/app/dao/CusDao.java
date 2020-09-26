package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Cus;

public interface CusDao {
	/**
	 * This method finds the customer based on its id
	 * @param id - id of an customer
	 * @return -  throws the customer object
	 * @throws CusNFException
	 */
	public Cus findById(int id) throws CusNFException;
	/**
	 * Lists  all the customers of portal
	 * @return
	 */
	public List<Cus> listAll();
	/**
	 * Saving Customer
	 * @param c- Customer object
	 * @return - Returns a status message
	 */
	public String save(Cus c) ;
	/**
	 * Deletes a customer from database based on ID
	 * @param i - id of customer
	 * @return -  Status message
	 */
	public String remove(int i);
}
