package com.celcom.day8;

import java.util.Iterator;

public class LambdaExpressionWithThread2 {

	public static void main(String[] args) {

		// anonymous inner class
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i + " * 2 = " + i * 2);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};

		new Thread(t1).start();

		Runnable t2 = () -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i + " * 2 = " + i * 2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		new Thread(t2).start();

	}

}
