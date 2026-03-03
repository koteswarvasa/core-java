package com.collections;

public class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int marks;

	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "rollNo=" + rollNo + ", name=" + name + ", marks=" + marks;
	}

	@Override
	public int compareTo(Student o) {

//		int x = this.rollNo;
//		int y = o.rollNo;

//		By using the ternary Operator
//		return (x < y) ? -1 : ((x == y) ? 0 : 1);
		
//		By using if- else
//		if(x<y) {
//			return -1;
//		}else if(x>y) {
//			return 1;
//		}else {
//			return 0;
//		}

//		ascending order
//		return Integer.compare(this.rollNo,o.rollNo);

//		decending Order
//		return Integer.compare(o.rollNo,this.rollNo);

//		when we have to check the String sorting  not using the compare() method for String
		return this.name.compareTo(o.name);

	}

}
