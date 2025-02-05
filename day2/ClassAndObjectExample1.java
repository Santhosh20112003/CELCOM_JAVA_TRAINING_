package com.celcom.day2;

class Employees {
	// varibales
	int id;
	String name;
	double salary;

	// methods
	void Display() {
		System.out.printf("Hello %s (%d) your salary is %f \n", name, id, salary);
	}
	
	

	// constructor
	Employees(String ename, int eid, double esalary) {
		name = ename;
		id = eid;
		salary = esalary;
	}
}

public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		Employees emp1 = new Employees("Santhosh", 101, 1234567.90); // executes automatically
		emp1.Display();
        
		Employees emp2 = new Employees("Yogesh", 102, 98765432.90); // executes automatically
		emp2.Display();
	}

}
