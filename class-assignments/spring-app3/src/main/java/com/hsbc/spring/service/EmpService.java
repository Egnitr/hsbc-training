package com.hsbc.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.entity.Emp;

@Service
public class EmpService {
	@Autowired
	private EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String registerEmp(int id, String name, String city, double salary) {
		return dao.save(new Emp(id, name, city, salary));
	}

}