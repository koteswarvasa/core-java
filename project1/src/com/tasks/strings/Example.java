package com.tasks.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example {
	
	
public static void main(String[] args) {
	
	ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4));
	
	Consumer<Integer> con = new Consumer<>() {
		public void accept(Integer i) {
			System.out.println(i);
		}
	};
	
	list.forEach(con);
	

}
}
