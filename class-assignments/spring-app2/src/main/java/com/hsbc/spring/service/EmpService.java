package com.hsbc.spring.service;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.entity.Emp;

public class EmpService {

	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		return dao.save(new Emp(id, name, city, salary));
	}

}