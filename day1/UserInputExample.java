package com.celcom.day1;
import java.util.Scanner;

class UserInputExample{
	public static void main(String values[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee ID: ");
		int id = sc.nextInt();
		System.out.println("Employee Name: ");
		String ename = sc.next();
		System.out.println("Employee Salary: ");
		double esalary = sc.nextDouble();

		System.out.printf("Employee ID: %d \n",id);	
		System.out.printf("Employee Name: %s \n",ename);
		System.out.printf("Employee Salary: %.2f \n",esalary);	
	}
}