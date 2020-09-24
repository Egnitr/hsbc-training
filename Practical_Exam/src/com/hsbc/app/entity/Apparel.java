package com.hsbc.app.entity;

public class Apparel {
	int code;
	String name;
	String size;
	String material;
	int quantity;
	double price;
	
	

	public Apparel(int code, String name, String size, String material, int quantity, double price) {
		super();
		this.code = code;
		this.name = name;
		this.size = size;
		this.material = material;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
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
        return code+" "+name+" "+quantity+" "+size+" "+material;
    }
	
	@Override
	public boolean equals(Object obj) {
		Apparel e=(Apparel)obj;
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
