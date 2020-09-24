package com.hsbc.app.service;

import com.hsbc.app.dao.ElectronicsDaoImpl;
import com.hsbc.app.dao.ItemNFException;
import com.hsbc.app.entity.Electronics;

public class ElectronicsService {

	private ElectronicsDaoImpl dao;

	public ElectronicsService(ElectronicsDaoImpl dao) {
		this.dao = dao;
	}

	public String registerElectronics(int code, String name,int warranty, int quantity, double price) {
		return dao.save(new Electronics(code, name, warranty,  quantity, price));
	}

	public String getElectronicsDetails(int id) {

		try {
			Electronics e = dao.findById(id);

			return e.getCode() + " " + e.getName() + " " + e.getQuantity() + " " + e.getWarranty();
		} catch (ItemNFException ex) {
			throw new RuntimeException("Item Not found");
		}
	}

	public void printElectronicsList() {

		for (Electronics e1 : dao.listAll()) {
			System.out.println(e1.getCode() + " " + e1.getName() + " " + e1.getQuantity() + " " + e1.getWarranty());
		}
	}
}
