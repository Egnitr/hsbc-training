package com.hsbc.app.entity;

public class FoodItems {
	int code;
	String name;
	String manufactureDate;
	String expiryDate;
	String veg;
	int quantity;
	double price;
	
	public FoodItems(int code, String name, String manufactureDate, String expiryDate, String veg, int quantity,double price) {
		this.code = code;
		this.name = name;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.veg = veg;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getManufactureDate() {
		return manufactureDate;
	}


	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getVeg() {
		return veg;
	}


	public void setVeg(String veg) {
		this.veg = veg;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
    public String toString() {
        return code+" "+name+" "+quantity+" "+veg;
    }
	
	@Override
	public boolean equals(Object obj) {
		FoodItems e=(FoodItems)obj;
		if (this.getCode()==e.getCode()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getCode();
	}
}
