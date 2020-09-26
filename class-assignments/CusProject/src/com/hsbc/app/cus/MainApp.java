package com.hsbc.app.cus;

import com.hsbc.app.dao.CusDao;
import com.hsbc.app.impl.CusDb;
import com.hsbc.app.service.CusService;

public class MainApp {

	public static void main(String[] args) {
		CusDao dao=new CusDb();
		CusService service = new CusService(dao);
		try {
			System.out.println(service.getCusDetails(101));
			
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}
		service.deregisterCus(101);
		System.out.println("|///\\\\///\\\\///\\\\///\\\\///\\\\///\\\\|");

		service.printCusList();

	}

}
