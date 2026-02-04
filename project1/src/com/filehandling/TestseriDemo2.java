package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestseriDemo2 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis = new FileInputStream("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\filehandling\\abc.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	
	Student st = (Student)ois.readObject();
	
	System.out.println(st.id);
	System.out.println(st.name);
	System.out.println(st.password);
	
	ois.close();
}
}
