package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSetDemo4 {
	public static void main(String[] args) {
		
//		Navigable set is children of sorted set
//				- It is acts like the sorted set but in this extra method involves
		
		NavigableSet<Integer> set = new TreeSet<>();

		set.add(12);
		set.add(15);
		set.add(14);
		set.add(16);
		set.add(11);
		set.add(10);
		
		System.out.println(set);

		System.out.println("**********************************");
		
//		Returns the least element in this set greater than or equal to the given element, 
//		or null if there is no such element.
		System.out.println(set.ceiling(13));
		
//		Returns the greatest element in this set less than or equal to the given element, 
//		or null if there is no such element.
		System.out.println(set.floor(13));
		
		System.out.println("**********************************");
		System.out.println(set.ceiling(15));//15
		System.out.println(set.floor(13));//12
		
		System.out.println("------------------------------------------");
//		Returns the least element in this set strictly greater than the given element,
//		or null if there is no such element.
		System.out.println(set.higher(15));//16
		
//		Returns the greatest element in this set strictly less than the given element,
//		or null if there is no such element.
		System.out.println(set.lower(15));
				
		
	}
}
