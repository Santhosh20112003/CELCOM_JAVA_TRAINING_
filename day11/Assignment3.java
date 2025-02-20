package com.celcom.day11;

import java.util.Scanner;

public class Assignment3 {
	static Scanner sc = new Scanner(System.in);

	float getItemTime(float time, int item) {
		float time2 = time;
		if (item == 2) {
			time2 = time + (time * (150 / 100));
		} else if (item == 3) {
			time2 = time + (time * (200 / 100));
		}
		System.out.println(time2);
		return time2;
	}

	float getTypeTime(float time, String type) {
		float time2 = time;
		if (type.equals("frozen meal")) {
			time2 = time + (time * (120 / 100));
		} else if (type.equals("pasta")) {
			time2 = time + (time * (110 / 100));
		}
		System.out.println(time2);
		return time2;
	}

	float getModelTime(float time, String type) {
		float time2 = time;
		if (type.equals("medium")) {
			time2 = time + (time * (90 / 100));
		} else if (type.equals("low")) {
			time2 = time + (time * (115 / 100));
		}
		System.out.println(time2);
		return time2;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of items (1, 2, 3):");
		int item = sc.nextInt();
		System.out.println("Enter the heating time for one item (in seconds):");
		float time = sc.nextInt();
		System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables):");
		String type = sc.next().toLowerCase();
		System.out.println("Enter the microwave model (high, medium, low):");
		String model = sc.next().toLowerCase();
		time = new Assignment3().getItemTime(time, item);
		time = new Assignment3().getTypeTime(time, type);
		time = new Assignment3().getModelTime(time, model);
		System.out.println("The recommended heating time is:" + time + "seconds");
	}

}
