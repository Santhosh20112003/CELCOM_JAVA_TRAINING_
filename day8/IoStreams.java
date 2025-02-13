package com.celcom.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoStreams {

	public static void main(String[] args) throws IOException {
		// read and write data from files i.e .txt files

		FileReader obj = new FileReader("D:\\Example.txt");
		int ch = 0;
		while ((ch = obj.read()) != -1) {
			System.out.print((char) ch);
		}

		System.out.println("\n" + obj.ready());

		obj.close();

		FileWriter obj2 = new FileWriter("D:\\\\Example.txt");

		obj2.append('5');

		obj2.close();

	}

}
