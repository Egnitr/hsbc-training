package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Electronics;

public interface ElectronicsDaoImpl {
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

