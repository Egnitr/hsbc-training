package com.demo.threads;

public class Worker implements Runnable{
	String msg;		
	MessagePrinter mp;
	public Worker(MessagePrinter mp,String msg) {
		this.msg = msg;
		this.mp=mp;
	}
	public void run() {
		synchronized (mp) {
			mp.print(msg);
		}
		
	} 
}
