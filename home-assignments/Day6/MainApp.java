package com.demo.hw;

public class MainApp {

	public static void main(String[] args) throws InterruptedException{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		System.out.println("Thread Start...");
		t1.start();
		t2.start();
		t3.start();
		 t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Thread Ends...");
	}

}
