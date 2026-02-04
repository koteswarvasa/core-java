package com.exception_handling.tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Problem3 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\exception_handling\\tasks\\data.ser"));
			oos.writeObject(new Student(1,"Koti"));
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\HAI\\workspaces\\project1\\src\\com\\exception_handling\\tasks\\data.ser"));
			Student st = (Student)ois.readObject();
			ois.close();
			System.out.println(st.id+" "+st.name);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
