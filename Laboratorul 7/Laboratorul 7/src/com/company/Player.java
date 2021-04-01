package com.company;

public class Player extends Thread {
    private String pName;
    private int score;

    public Player(String name, int score) {
        this.pName = name;
        this.score = score;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + pName + '\'' +
                ", score=" + score +
                '}';
    }
    public void printScore()
    {
        System.out.println(this.pName + " are scorul " + this.score);
    }

}
