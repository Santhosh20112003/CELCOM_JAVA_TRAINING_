package com.celcom.day7;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("My Thread is working...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {
	public static void main(String[] args) throws Exception {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());

		Thread1 obj = new Thread1();
		System.out.println(obj.getState());
		obj.setName("Thread 1");
		obj.start();

		Thread.sleep(2000);

		System.out.println("MAIN THREAD END");
	}

}
