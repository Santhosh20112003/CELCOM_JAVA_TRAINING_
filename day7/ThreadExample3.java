package com.celcom.day7;

class Threadz extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is working...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample3 {

	public static void main(String[] args) {
		Threadz obj1 = new Threadz();
		Threadz obj2 = new Threadz();
		obj1.setName("Thread 1");
		obj2.setName("Thread 2");

		obj1.start();
		obj2.start();
	}

}
