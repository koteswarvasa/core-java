package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int id=1;
	String name="koti";
	transient String password = "k";
}
public class TestSeriDemo1{
public static void main(String[] args) throws IOException {
	Student s = new Student();
	
	File f = new File("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\filehandling\\abc.ser");
	
	FileOutputStream fos = new FileOutputStream(f);
	
	ObjectOutputStream oos= new  ObjectOutputStream(fos);
	
	oos.writeObject(s);
	
	oos.close();
	
}
}
