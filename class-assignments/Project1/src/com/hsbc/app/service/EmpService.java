package com.hsbc.app.service;

import com.hsbc.app.dao.DuplicateEmpException;
import com.hsbc.app.dao.EmpDao;
import com.hsbc.app.dao.EmpNFException;
import com.hsbc.app.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) throws DuplicateEmpException {
		return dao.save(new Emp(id, name, city, salary));
	}

	public String getEmpDetails(int id) {

		try {
			Emp e = dao.findById(id);

			return e.getId() + " " + e.getName() + " " + e.getCity() + " " + e.getSal();
		} catch (EmpNFException ex) {
			throw new RuntimeException("Emp Not found");
		}
	}

	public void printEmpList() {

		for (Emp e1 : dao.listAll()) {
			System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getCity() + " " + e1.getSal());
		}
	}
}