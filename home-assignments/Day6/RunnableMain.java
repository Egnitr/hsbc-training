package com.demo.hw;

public class RunnableMain {

	
		public static void main(String[] args) throws InterruptedException{
			Thread t1=new Thread(new MyThread());
			Thread t2=new Thread(new MyThread());
			Thread t3=new Thread(new MyThread());
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

