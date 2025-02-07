package com.celcom.day3;

class Movies {
	float rating;
	String name;
	private double budget;
	float duration;
	char certificate;

	double setBudgetAndReturn(double mbudget) {
		budget = mbudget;
		return budget;
	}

	double getBudget() {
		return budget;
	}
	
	

	Movies(float rating, String name, float duration, char certificate, double budget) {
		this.certificate = certificate;
		this.duration = duration;
		this.budget = budget;
		this.name = name;
		this.rating = rating;
	}

}

public class ClassAndObjectForMovies {

	public static void main(String[] args) {
		Movies intesteller = new Movies(4.0F,"Intesteller",02.45F,'U',12000000);
		System.out.println(intesteller.getBudget());;
	}

}
