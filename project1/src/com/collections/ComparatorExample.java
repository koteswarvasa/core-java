package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
	
// what is comparator ?
//	         - Comparator is an interface in Java used to define custom sorting logic for objects.
//			 - While Comparable gives one natural sorting order,
//			   Comparator allows you to create multiple different sorting logics.
	
//	Difference Between Comparable and Comparator
	
//	---------------------------------------------------------------
//	|Comparable					|Comparator                       |
//	|-------------------------------------------------------------|
//	|Present inside the class	| Present outside the class		  |
//	|Only one sorting logic		| Multiple sorting logics possible|
//	|Uses compareTo()			| Uses compare()				  |
//	---------------------------------------------------------------
	
//	Modifies original class	No need to modify class
	
	
	public static void main(String[] args) {
		
		
//		Comparator<Integer> comp =  (Integer x, Integer y) -> Integer.compare(y, x);
//		Comparator<Integer> comp = Comparator.comparingInt((Integer i) -> i).reversed();
//		Comparator<Student> namesComp = (Student s1, Student s2) -> s1.name.compareTo(s2.name);
//		Comparator<Student> namesComp = Comparator.comparing(s -> s.name,Comparator.nullsLast(Comparator.naturalOrder()));
		Comparator<Student> namesComp = Comparator.comparing(s -> s.name);
		Comparator<Student> marksComp = Comparator.comparing(s -> s.marks);
		Comparator<Student> rollNoComp = Comparator.comparing(s -> s.rollNo);
		
		
//		Integer[] arr = {2,3,1,7,5};
//		Arrays.sort(arr,comp);
//		System.out.println(Arrays.toString(arr));
		
		
		
//		int[] arr = {1,2,8,6,7,3,9};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Integer[] arr = {1,2,8,6,7,3,9};
//		List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//		Collections.sort(list);
//		System.out.println(list);
		
		Student[] students = {new Student(101,"koti",300),
							  new Student(105,"venkat",400),
							  new Student(102,"naveen",500),
							  new Student(104,"krishna",600),
		};
		
//		Arrays.sort(students,namesComp);
//		System.out.println(Arrays.toString(students));
//		for(Student student : students) {
//			System.out.println(student);
//		}
		
//		Exception in thread "main" java.lang.ClassCastException
//		Arrays.sort(students);
//		System.out.println(Arrays.toString(students));
		
		
//		Before Using Comparable
		List<Student> studentList = new ArrayList<>(Arrays.asList(students));
		
//		Collections.sort(studentList);
//		
//		for(Student student : studentList) {
//			System.out.println(student);
//		}
//		
		
//		names
		Collections.sort(studentList,namesComp);
		System.out.println(studentList);
		
//		marks
		Collections.sort(studentList,marksComp);
		System.out.println(studentList);
		
//		rollNo
		Collections.sort(studentList,rollNoComp);
		System.out.println(studentList);
		
		
	}
}
