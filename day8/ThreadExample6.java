package com.celcom.day8;

import java.util.Scanner;

class Data {
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
		System.out.println("Current Balance is Rs: " + getData());
	}

}

class Withdrawer extends Thread {
	Data data;

	public Withdrawer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		synchronized (data) {
			System.out.println("Hello From Withdrawer");
			try {
				data.wait();
				Thread.sleep(2000);
				int amount = new Scanner(System.in).nextInt();

				if (amount < data.getData()) {
					data.setData(data.getData() - amount);
					System.out.println("Withdrawled amount is " + amount);
				} else {
					System.out.println("Insufficient Funds");
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Deposit extends Thread {
	Data data;

	public Deposit(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		synchronized (data) {
			System.out.println("Hello From Depositer");
			data.setData(new Scanner(System.in).nextInt());
			System.out.println("Depositing Amounts...");
			data.notify();
			System.out.println("Deposited");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample6 {

	public static void main(String[] args) throws InterruptedException {
		Data data = new Data();
		Withdrawer obj1 = new Withdrawer(data);
		Deposit obj2 = new Deposit(data);
		
		obj1.start();

		Thread.sleep(2000);

		obj2.start();

	}

}
