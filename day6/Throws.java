package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {

	static FileReader textFile() throws FileNotFoundException {
		return new FileReader("demo.txt");
	}

	static FileReader htmlFile() throws FileNotFoundException {
		return new FileReader("index.html");
	}

	void wrapperMethod() {
		try {
			FileReader txt = textFile();
			FileReader html = htmlFile();
		} catch (Exception e) {
			System.out.println("You've got an Exception");
		}
	}

	public static void main(String[] args) {
//		try {
//			FileReader txt  = textFile();
//			FileReader html = htmlFile();
//		}
//		catch (Exception e) {
//			System.out.println("You've got an Exception");
//		}

		new Throws().wrapperMethod();
	}

}
