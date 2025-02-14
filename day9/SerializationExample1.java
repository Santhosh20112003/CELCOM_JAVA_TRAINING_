package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//bean class act as a container reduce the number arguments 

class Employee implements Serializable {
	transient private int eid;
	private int esalary;
	private String ename;

	public Employee(int eid, int esalary, String ename) {
		this.eid = eid;
		this.esalary = esalary;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", esalary=" + esalary + ", ename=" + ename + "]";
	}

}

public class SerializationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee obj = new Employee(85, 500000, "Santhosh");
		Employee obj2 = new Employee(85, 500000, "Santhosh");

		// serialization
		FileOutputStream file = new FileOutputStream("D://ObjectFile.txt");
		// converting normal text file to object writable format
		ObjectOutputStream objout = new ObjectOutputStream(file);
		objout.writeObject(obj);
		objout.write(0);

		objout.close();
		file.close();
		System.out.println("Object Saved");

		// De-Serialization

		FileInputStream input = new FileInputStream("D://ObjectFile.txt");

		ObjectInputStream objinp = new ObjectInputStream(input);

		Object e1 = objinp.readObject();

		objinp.close();
		input.close();

		System.out.println(e1);

	}

}
