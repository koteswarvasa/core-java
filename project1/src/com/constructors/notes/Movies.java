package com.constructors.notes;

public class Movies {
	
	
	// Copy Constructor
	
	
    String movieName;
    String hero;
    String heroine;
    String director;
    double budget;
    
    Movies() {
        System.out.println("no - args constructor");
    }
    
    public Movies(String movieName) {
        this.movieName = movieName;
    }

    Movies(Movies m1, String hero) {
        this.movieName = m1.movieName;
        this.hero = hero;
    }

    public Movies(Movies m2, String heroine, String director) {
        this.movieName = m2.movieName;
        this.hero = m2.hero;
        this.heroine = heroine;
        this.director= director;
    }
    

    public Movies(Movies m3,double budget) {
        this.movieName = m3.movieName;
        this.hero = m3.hero;
        this.heroine = m3.heroine;
        this.director = m3.director;
        this.budget = budget;
    }

    void show() {
        System.out.println("******************************************");
        System.out.println("Name of the movie: " + movieName);
        System.out.println("Name of the hero: " + hero);
        System.out.println("Name of the heroine: " + heroine);
        System.out.println("Director of the movie: " + director);
        System.out.println("Budget of the movie: " + budget);
    }

    public static void main(String[] args) {
        System.out.println("main method started");

        Movies m1 = new Movies("Siva");
        m1.show();

        Movies m2 = new Movies(m1, "NTR");
        m2.show();

        Movies m3 = new Movies(m2, "Jhanavi", "siva");
        m3.show();

        Movies m4 = new Movies(m3,5000000.00);
        m4.show();
    }
}
