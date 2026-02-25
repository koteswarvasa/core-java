package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollectionDemo2 {
	public static void main(String[] args) {
		Collection<String> boys = new ArrayList<>();
		boys.add("koti");
		boys.add("krishna");
		boys.add("naveen");
		boys.add("venkat");
		boys.add("ravi");
		
//		System.out.println(boys);
		
		Collection<String> girls = new ArrayList<>();
		girls.add("abcd");
		girls.add("bcde");
		girls.add("cdef");
		girls.add("defg");
		girls.add("efgh");
		
//		System.out.println(girls);
		
		
		Collection<String> students  = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		
//		boys.clear();
//		System.out.println(boys);
		System.out.println(students);
		
		
		System.out.println(students.contains("koti"));
		System.out.println(students.contains("rajesh"));
		
		System.out.println("**************");
		System.out.println(students.containsAll(boys));
		
		Collection<String> staff = new ArrayList<>();
		
//		if the staff is empty it return true
		System.out.println(students.containsAll(staff));//true
		
		
		
	}
}
