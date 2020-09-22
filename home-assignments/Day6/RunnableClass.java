package com.demo.hw;

public class RunnableClass implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"th"+Thread.currentThread().getName());
			
		}
	}

}
