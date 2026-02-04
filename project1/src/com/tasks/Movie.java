package com.tasks;

public class Movie {
	String title;
	String director;
	double rating;

	Movie() {
		this("OG");
		System.out.println("no-args constructor!...");
//		title="unknown";
//		director="unknown";
//		rating=0.0;
	}

	Movie(String title) {
		this(title, "Sukumar");
		System.out.println("1-arg constructor");

	}

	Movie(String title, String director) {
		this(title, director, 5.0);
		System.out.println("2-args constructor");

	}

	Movie(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
		System.out.println("3-args constructor");

	}

	void display() {
		System.out.println("===== Movie details ====");
		System.out.println("Title: " + title);
		System.out.println("Director: " + director);
		System.out.println("Rating: " + rating);
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Movie m = new Movie();
		m.display();
//		System.out.println();
//
//		Movie m1 = new Movie("pushpa");
//		m1.display();
//		System.out.println();
//
//		Movie m2 = new Movie("devara", "siva");
//		m2.display();
//		System.out.println();
//
//		Movie m3 = new Movie("DEVARA", "Koratala Siva", 5.0);
//		m3.display();
//		System.out.println();

	}
}
