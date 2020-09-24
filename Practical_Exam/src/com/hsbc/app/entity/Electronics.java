package com.hsbc.app.entity;

public class Electronics {
	int code;
	String name;
	int warranty;
	int quantity;
	double price;
	
	public Electronics(int code, String name,int warranty, int quantity, double price) {
		super();
		this.code = code;
		this.name = name;
		this.warranty = warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
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
        return code+" "+name+" "+price+" "+warranty+" "+quantity;
    }
	
	@Override
	public boolean equals(Object obj) {
		Electronics e=(Electronics)obj;
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
