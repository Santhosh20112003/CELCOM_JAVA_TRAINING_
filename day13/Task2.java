package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {

	public static void main(String[] args) {

		ExecutorService obj = Executors.newFixedThreadPool(6);

		for (int i = 1; i <= 10; i++) {
			int taskNumber = i;
			obj.execute(() -> {
				System.out.println(
						"Task " + taskNumber + " is being executed by thread " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			});
		}
		
		
		
	}

}
