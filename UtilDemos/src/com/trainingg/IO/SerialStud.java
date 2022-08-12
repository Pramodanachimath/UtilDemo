package com.trainingg.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {
 public static void main(String[] args) {
	Student student=new Student("Pramod",3020,"Development");
	System.out.println(student);
	FileOutputStream fileoutputsteam=null;
	ObjectOutputStream os=null;
	try {
		 fileoutputsteam=new FileOutputStream("sample.txt");
		 os=new ObjectOutputStream(fileoutputsteam);
		 os.writeObject(student);
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(fileoutputsteam!=null)
			fileoutputsteam.close();
	        if(os!=null)
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
}
