package com.trainingg.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DSerialDemo {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("sample.txt");
				ObjectInputStream is = new ObjectInputStream(fis);) {
			Student student = (Student) is.readObject();
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
