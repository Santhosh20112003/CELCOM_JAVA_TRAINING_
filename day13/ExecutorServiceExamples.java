package com.celcom.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable {
	@Override
	public void run() {

	}
}

public class ExecutorServiceExamples {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		Runnable obj = () -> {
			System.out.println("Hello");
		};
		
		pool.submit(() -> {
			System.out.println("Hello");
		});

	}

}
