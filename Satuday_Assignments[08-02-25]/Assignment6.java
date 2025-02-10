package com.celcom.day5;

class Employee {
	String name, job_title;
	double salary;

	Employee(String name, String job_title, double salary) {
		this.name = name;
		this.job_title = job_title;
		this.salary = salary;
	}

	void updateSalary(double salary) {
		this.salary = salary;
		System.out.println("Salary updated to: " + salary);
	}

	public void calculateSalaryAfterRaise(double percentage) {
		double raise = salary * (percentage / 100);
		salary += raise;
		System.out.println("Salary after " + percentage + "% raise: " + salary);
	}

	public void displayEmployeeDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Job Title: " + job_title);
		System.out.println("Salary: " + salary);
	}

}

public class Assignment6 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("John Doe", "Software Engineer", 60000);

		employee1.displayEmployeeDetails();

		employee1.updateSalary(65000);

		employee1.calculateSalaryAfterRaise(10);

		employee1.displayEmployeeDetails();

	}

}
