package com.tasks;

public class CelciusToFahenheitAndFahenheitToCelcius {
	public static void main(String[] args) {

		System.out.println("=======Celcius To Fahenheit=======");
		int celcius = 40;
		double farhenheit = (celcius * 9 / 5) + 32;
		System.out.println("Faahenheit Value: " + farhenheit);
		System.out.println();

		System.out.println("=======Fahenheit To Celcius=======");
		double farhenheit1 = farhenheit;
		int celcius1 = (int) (farhenheit1 - 32) * 5 / 9;
		System.out.println("Celcius Value: " + celcius1);

	}
}
