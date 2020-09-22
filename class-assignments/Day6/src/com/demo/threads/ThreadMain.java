package com.demo.threads;

public class ThreadMain {

	public static void main(String[] args) throws Exception {
		MyThread t1=new MyThread();
		t1.start();
		t1.join();
	}
}
