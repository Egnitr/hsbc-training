package com.hsbc.app;

import com.hsbc.app.dao.ApparelDaoImpl;
import com.hsbc.app.dao.ElectronicsDaoImpl;
import com.hsbc.app.dao.FoodDaoImpl;
import com.hsbc.app.impl.ApparelDb;
import com.hsbc.app.impl.ElectronicsDb;
import com.hsbc.app.impl.FoodDb;
import com.hsbc.app.service.ApparelService;
import com.hsbc.app.service.ElectronicsService;
import com.hsbc.app.service.FoodService;

public class MainApp {

	public static void main(String[] args) {
		int choice=1;
		if (choice==1) {
			FoodDaoImpl dao=new FoodDb();
			FoodService service = new FoodService(dao);
			try {
				service.printFoodList();
				
			} catch (RuntimeException ex) {
				System.out.println(ex.getMessage());
			}
		} 
		if (choice==2) {
			ApparelDaoImpl dao=new ApparelDb();
			ApparelService service = new ApparelService(dao);
			try {
				service.printApparelList();
				
			} catch (RuntimeException ex) {
				System.out.println(ex.getMessage());
			}
		} 
		if (choice==3) {
			ElectronicsDaoImpl dao=new ElectronicsDb();
			ElectronicsService service = new ElectronicsService(dao);
			try {
				service.printElectronicsList();
				
			} catch (RuntimeException ex) {
				System.out.println(ex.getMessage());
			}
		} 

	}

}
