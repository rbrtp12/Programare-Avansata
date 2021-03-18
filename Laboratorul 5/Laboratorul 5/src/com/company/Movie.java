package com.company;

public class Movie extends Item{
    private String numeDirector;
    private float rating;
    private int durata; //movie's lenght in minutes
    private MovieGenre genre;
    public enum MovieGenre
    {
        ACTIUNE, COMEDIE, GROAZA, ROMANTIC;
    }

    public Movie(String name, int size, MovieGenre genre, String numeDirector, float rating, int durata) {
        super(name, size);
        this.genre = genre;
        this.numeDirector = numeDirector;
        this.rating = rating;
        this.durata = durata;
        System.out.println("Ai creat filmul " + this.name);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", numeDirector='" + numeDirector + '\'' +
                ", rating=" + rating +
                ", durata=" + durata +
                ", genre=" + genre +
                '}';
    }
}
