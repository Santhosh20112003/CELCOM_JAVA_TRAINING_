package com.celcom.day7;

class TwoTable extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * 2 = " + i * 2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class FiveTable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.err.println(i + " * 5 = " + i * 5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample4 {

	public static void main(String[] args) throws InterruptedException {
		TwoTable obj1 = new TwoTable();
		Thread obj2 = new Thread(new FiveTable());

		obj1.start();
		obj1.join();
		System.out.println("Main");
		obj2.start();
	}

}
