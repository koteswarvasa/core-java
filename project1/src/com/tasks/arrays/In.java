package com.tasks.arrays;

interface A {
	void sum(int c, int d);

	void sub(int c, int d);
}

public class In {
	public static void main(String[] args) {
		Integer[] arr = { 5, 3, 2, 1, 4, 5, 3 };
		

		A a = new A() {
			@Override
			public void sum(int c, int d) {
				System.out.println(c + d);
			}

			@Override
			public void sub(int c, int d) {
				System.out.println(c - d);
			}

		};

		a.sum(1, 2);
		a.sub(2, 4);

	}

}
