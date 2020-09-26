package com.hsbc.app.tr;

import com.hsbc.app.dao.EmpDao;
import com.hsbc.app.entity.Emp;
import com.hsbc.app.impl.EmpDaoJdbcImpl;
import com.hsbc.app.impl.EmpDb;
import com.hsbc.app.service.EmpService;

public class MainApp {

	public static void main(String[] args) {
		EmpDao dao=new EmpDaoJdbcImpl();
		EmpService service = new EmpService(dao);
		try {
			System.out.println(service.getEmpDetails(101));
			
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println("|-----------------------|");

		// String resp=service.registerEmp(105, "Raman", "Bhopal", 67000);
		// System.out.println(resp);

		service.printEmpList();

	}

}
