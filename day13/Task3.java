package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task3 {

	public static void main(String[] args) {
		ExecutorService obj = Executors.newCachedThreadPool();

		for (int i = 1; i <= 10; i++) {
			int taskNumber = i;
			obj.execute(() -> {
				try {
					Thread.currentThread().sleep(taskNumber * 2000);
					System.out.println(
							"Task " + taskNumber + " is being executed by thread.");

				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			});
		}

	}

}
