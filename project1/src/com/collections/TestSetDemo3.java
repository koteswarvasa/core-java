package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSetDemo3 {
	public static void main(String[] args) {

//		Insertion Order: we can choose the LinkedHashSet

//		Set<Integer> set = new LinkedHashSet<>();
//
//		set.add(101);
//		set.add(111);
//		set.add(103);
//		set.add(103);
//		set.add(123);
//		set.add(119);
//		set.add(107);
//
//		System.out.println(set);

		
		SortedSet<Integer> set = new TreeSet<>();

		set.add(101);
		set.add(111);
		set.add(103);
		set.add(103);
		set.add(123);
		set.add(119);
		set.add(107);

		System.out.println("Get first Element in set: "+set.first());
		System.out.println("Get last Element in set: "+set.last());
		System.out.println("Get first Element in set: "+set.getFirst());
		System.out.println("Get last Element in set: "+set.getLast());
		System.out.println("Get sub set for the given range Elements in set: "+set.subSet(102,200));
		System.out.println("Get before Elements of headSet in set: "+set.headSet(105));
		System.out.println("Get before Elements of headSet in set: "+set.headSet(102));
		System.out.println("Get after Elements of tailSet in set: "+set.tailSet(107));
		System.out.println("*****************************************************");
		System.out.println(set.reversed());
		System.out.println(set);

	}
}
