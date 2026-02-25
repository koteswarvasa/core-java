package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSetDemo5 {
public static void main(String[] args) {
	
	NavigableSet<Object> set = new TreeSet<>();

	set.add(10);
	set.add("koteswar");
	set.add("java");
	set.add(16);
	set.add(11.6);
	set.add(55.5);

//	ClassCastException: it is unchecked Exception 
//			- Because 'Treeset' is allow only homogenous data only
	System.out.println(set);
}
}
