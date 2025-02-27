package com.celcom.day11;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String address;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(int id, String name, String email, String address, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	public Employee(String name, String email, String address, int age) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		if (this.id != 0)
			return this.id + " | " + this.name + " | " + this.age + " | " + this.email + " | " + this.address;
		return this.name + " | " + this.age + " | " + this.email + " | " + this.address;
	}
}
