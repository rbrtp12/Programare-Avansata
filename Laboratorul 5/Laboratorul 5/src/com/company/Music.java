package com.company;

public class Music extends Item {
    private String numeArtist;
    private MusicGenre genre;

    public enum MusicGenre
    {
        POP, ROCK, RAP, TRAP, TECHNO, HOUSE;
    }

    public Music(String name, int size, String numeArtist, MusicGenre genre) {
        super(name, size);
        this.numeArtist = numeArtist;
        this.genre = genre;
        System.out.println("Ai creat melodia " + this.genre + " " + this.name);
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", numeArtist='" + numeArtist + '\'' +
                ", genre=" + genre +
                '}';
    }
}
