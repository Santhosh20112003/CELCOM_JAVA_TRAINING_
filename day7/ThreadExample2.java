package com.celcom.day7;

class Thread2 implements Runnable {
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

public class ThreadExample2 {
	public static void main(String[] args) throws Exception {
		Thread obj = new Thread(new Thread2());
		System.out.println(obj.getState());
		obj.setName("Thread 1");
		obj.start();

		Thread.sleep(2000);

		System.out.println("MAIN THREAD END");

//		obj.suspend();
		

		System.out.println(obj.getState());
	}

}
