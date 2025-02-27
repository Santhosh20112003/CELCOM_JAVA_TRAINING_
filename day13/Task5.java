package com.celcom.day13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableSample implements Callable<Integer> {
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += i;
		}
		return sum;
	}

}

public class Task5 {
	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(1);
		Future<Integer> future = exe.submit(new CallableSample());
		try {
			System.out.println(future.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
		exe.shutdown();
	}
}
