package com.hsbc.app.entity;

public class Cus {
		int id;
		String name;
		String day;
		double bill;
		public Cus(int id, String name, String day, double bill) {
			this.id = id;
			this.name = name;
			this.day = day;
			this.bill = bill;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDay() {
			return day;
		}
		public void setDay(String day) {
			this.day = day;
		}
		public double getBill() {
			return bill;
		}
		public void setBill(double bill) {
			this.bill = bill;
		}
		@Override
	    public String toString() {
	        return id+" "+name+" "+day+" "+bill;
	    }
		@Override
		public boolean equals(Object obj) {
			Cus e=(Cus)obj;
			if (this.getId()==e.getId()) {
				return true;
			}
			return false;
		}
		@Override
		public int hashCode() {
			return this.getId();
		}
		
}
