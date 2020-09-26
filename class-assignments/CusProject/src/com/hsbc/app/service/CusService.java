package com.hsbc.app.service;

import com.hsbc.app.dao.CusDao;
import com.hsbc.app.dao.CusNFException;
import com.hsbc.app.entity.Cus;

public class CusService {

	private CusDao dao;

	public CusService(CusDao dao) {
		this.dao = dao;
	}

	public String registerCus(int id, String name, String city, double salary) {
		return dao.save(new Cus(id, name, city, salary));
	}
	public String deregisterCus(int i) {
		return dao.remove(101);
	}

	public String getCusDetails(int id) {

		try {
			Cus e = dao.findById(id);

			return e.getId() + " " + e.getName() + " " + e.getDay() + " " + e.getBill();
		} catch (CusNFException ex) {
			throw new RuntimeException("Customer Not found");
		}
	}

	public void printCusList() {

		for (Cus e1 : dao.listAll()) {
			System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getDay() + " " + e1.getBill());
		}
	}
}