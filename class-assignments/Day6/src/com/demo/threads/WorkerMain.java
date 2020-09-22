package com.demo.threads;

public class WorkerMain {

	public static void main(String[] args) throws Exception {
		MessagePrinter mp=new MessagePrinter();
		Thread t1=new Thread(new Worker(mp,"Hello"));
		Thread t2=new Thread(new Worker(mp,"Good"));
		Thread t3=new Thread(new Worker(mp,"Morning"));
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}

}
