package com.celcom.day8;

import java.util.Iterator;

public class LambdaExpressionWithThread {

	public static void main(String[] args) {
		
		//anonymous inner class
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("Thread1 is Running");
				}
			}
		};

		new Thread(t1).start();
		
		Runnable t2 = () -> {
			for (int i = 0; i <= 5; i++) {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Thread2 is Running");
			}
		};
		
		new Thread(t2).start();

	}

}
