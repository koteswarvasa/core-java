package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {
public static void main(String[] args) {
	Collection<Float> c1 = new ArrayList<>();
//	c1.add(10); -> cannot convert to float
	
	c1.add(5.3F);
//	c1.add(5.3F);
//	c1.add(5.3F);
//	c1.add(5.3F);
//	c1.add(5.3F);
//	c1.add(5.3F);
	
	Collection<Float> c2 = new ArrayList<>();
	c2.add(5.3F);
	
	System.out.println(c1.equals(c2));
	
	Collection<Float> c3 = new ArrayList<>();
	
	if(!c3.isEmpty()) {
		c3.add(4.2F);
		c3.add(3.6F);
	}
	
	System.out.println(c3);//[]
	
}
}
