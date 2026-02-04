package com.tasks;

public class Courses {

	int id;
	String course;
	int duration;

	Courses(int id) {
		this(id, "python");
		System.out.println("1-args Constructor");
	}

	Courses(int id, String course) {
		this(id, course, 8);
		System.out.println("2-args constructor");

	}

	Courses(int id, String course, int duration) {
		this.id = id;
		this.course = course;
		this.duration = duration;
		System.out.println("3-args constructor");

	}

	void display() {
		System.out.println("**********************");
		System.out.println("Course id: " + id);
		System.out.println("Course Name: " + course);
		System.out.println("Course duration: " + duration);
	}

	public static void main(String[] args) {
		Courses e3 = new Courses(1, "java", 8);
		e3.display();

		Courses e2 = new Courses(2, "python");
		e2.display();

		Courses e1 = new Courses(3);
		e1.display();

	}
}
