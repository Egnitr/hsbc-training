package com.demo.threads;

public class MyThread extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
