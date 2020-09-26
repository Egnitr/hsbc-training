package com.hsbc.app.dao;

import java.util.List;

import com.hsbc.app.entity.Emp;
import com.hsbc.app.dao.EmpNFException;

public interface EmpDao {
	public Emp findById(int id) throws EmpNFException;
	public List<Emp> listAll();
	public String save(Emp e) throws DuplicateEmpException ;
	Emp updateName(int id, String name) throws EmpNFException;
}
