package com.demo.bank;

public class Bank {

	private double balance;
	public Bank(double balance) {
		this.balance = balance;
	}
	public double withraw(double amount) throws LBException {
		try {
			if(balance<1000)
			System.out.println("Low Balance");
			throw new LBException();
		} catch (LBException e) {
			System.out.println(e);
		}
		return balance;
		
	}
	public static void main(String[] args) {
		Bank b=new Bank(999);
		System.out.println(b.withraw(1000));
	}
	

}
