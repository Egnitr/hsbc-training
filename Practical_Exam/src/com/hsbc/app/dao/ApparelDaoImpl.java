package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Apparel;

public interface ApparelDaoImpl {
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

