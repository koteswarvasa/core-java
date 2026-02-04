package com.exception_handling.tasks;

import java.util.Scanner;

class OutOfStockException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfStockException(String message) {
		super(message);
	}
}

public class OnlineShoppingSysytem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Enter stocks are avaliable");
			int stock = sc.nextInt();
			if (stock < 1) {
				throw new OutOfStockException("we cannot buy if stocks are Zero");
			}

			System.out.println("Enter number of products to buy");
			int product = sc.nextInt();
			
			if(product>stock) {
				throw new OutOfStockException("Choose buy products based on stocks");
			}else {
				System.out.println("Successfully Purchase the Products !!");
				stock = stock-product;
				System.out.println("Reamaining Avaliable stocks are: "+stock);
			}

		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}
}
