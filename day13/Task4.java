package com.celcom.day13;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task4 {

	public static void main(String[] args) {
		ScheduledExecutorService exe = Executors.newScheduledThreadPool(3);
			
		for (int i = 0; i <= 10; i++) {
			exe.schedule(() -> {
				System.out.println("Current Time is : " + LocalTime.now());
			}, (long) (i * 1), TimeUnit.SECONDS);
		}
		
		exe.shutdown();
	}

}
