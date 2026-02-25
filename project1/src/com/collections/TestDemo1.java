package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo1 {
	public static void main(String[] args) {

//	Collection is a raw type. 
//	References to generic type Collection<E> should be parameterized.
//	E -> type of elements
//	Collection c = new ArrayList<>();

//	c.add("Koteswar");
//	c.add(4.3);
//	c.add(9);
//	c.add("java");
//	c.add(true);

//		By using the Object as Generic
		Collection<Object> c = new ArrayList<>();

		c.add("Koteswar");
		c.add(4.3);
		c.add(9);
		c.add("java");
		c.add(true);

		
		Collection<Integer> c1 = new ArrayList<>();

		c1.add(0);
		c1.add(100);
		c1.add(9);
		c1.add(54);
		c1.add(43);

		System.out.println(c1);
	}
}
