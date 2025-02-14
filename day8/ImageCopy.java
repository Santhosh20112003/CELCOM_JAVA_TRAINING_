package com.celcom.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream obj1 = new FileInputStream("D://sample.jpg");
		FileOutputStream obj2 = new FileOutputStream("D://Example1.jpg");

		StringBuffer str = new StringBuffer("");

		int ch = 0;

		while ((ch = obj1.read()) != -1) {
			str.append((char) ch);
			obj2.write(ch);
		}

//		System.out.println(str);

		obj2.close();
		ch = 0;
		for (int i = 1; i <= 100; i++) {
			String s = "D://demo/sample" + i + ".jpg";
			FileOutputStream obj = new FileOutputStream(s);
			System.out.println(s);
			while ((ch = obj1.read()) != -1) {
				str.append((char) ch);
				obj.write(ch);
			}
			obj.close();
		}
		obj1.close();

	}

}
