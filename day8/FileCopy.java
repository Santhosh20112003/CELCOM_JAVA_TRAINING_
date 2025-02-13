package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader obj1 = new FileReader("D://Example.txt");
		FileWriter obj2 = new FileWriter("D://Example1.txt");

		StringBuffer str = new StringBuffer("");

		int ch = 0;

		while ((ch = obj1.read()) != -1) {
			str.append((char) ch);
			obj2.write(ch);
		}

		System.out.println(str);
		obj1.close();
		obj2.close();

		for (int i = 1; i <= 100; i++) {
			String s = "D://demo/Example" + i + ".txt";
			FileWriter obj = new FileWriter(s);
			System.out.println(s);
			obj.write('L');
			obj.close();
		}

	}

}
