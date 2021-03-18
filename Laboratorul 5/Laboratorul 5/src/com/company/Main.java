package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Catalog catalog1 = new Catalog("C1", "C:\\Users\\rbrtp\\IdeaProjects\\Laboratorul 5\\src\\com\\company");
        Movie film1 = new Movie("Titanic", 180, Movie.MovieGenre.ROMANTIC ,"James Cameron", 7.8f, 210);
        Movie film2 = new Movie("The Wolf of Wall Street", 200, Movie.MovieGenre.ACTIUNE ,"Martin Scorsese", 8.2f, 180);

        catalog1.add(film1);
        catalog1.add(film2);
        catalog1.list();

        Music music1 = new Music("I'm upset", 3, "Drake", Music.MusicGenre.RAP);
        catalog1.add(music1);
        catalog1.list();

        catalog1.save();
    }
}
