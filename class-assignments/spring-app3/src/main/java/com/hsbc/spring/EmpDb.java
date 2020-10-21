package com.hsbc.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hsbc.spring.dao.EmpDao;
import com.hsbc.spring.entity.Emp;

@Repository
public class EmpDb implements EmpDao {
	static Map<Integer, Emp> empDB = new HashMap<>();

	@Override
	public String save(Emp e) {
			return "Emp Registered successfully : "+e.getId();
	}
}