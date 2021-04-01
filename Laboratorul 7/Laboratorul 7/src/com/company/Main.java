package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main extends Thread {


    public static void main(String[] args) {
	// write your code here
        int i, j;
        Board b = new Board();
        Player p1 = new Player("player1", 0);
        b.players.add(p1);
        Player p2 = new Player("player2", 0);
        b.players.add(p2); //am creat 2 playeri
        for(i = 0; i<10; i++){
            b.tokens.add(new Tokens());
            System.out.println(b.tokens.get(i).getValue());
        }
         //am creat 10 tokeni si le-am printat valorile

                p1.setScore(p1.getScore() + Board.tokens.get(0).getValue());
                p2.setScore(p2.getScore() + Board.tokens.get(1).getValue());
                p1.setScore(p1.getScore() + Board.tokens.get(2).getValue());
                p2.setScore(p2.getScore() + Board.tokens.get(3).getValue());
                p1.setScore(p1.getScore() + Board.tokens.get(4).getValue());
                p2.setScore(p2.getScore() + Board.tokens.get(5).getValue());
                p1.setScore(p1.getScore() + Board.tokens.get(6).getValue());
                p2.setScore(p2.getScore() + Board.tokens.get(7).getValue());
                p1.setScore(p1.getScore() + Board.tokens.get(8).getValue());
                p2.setScore(p2.getScore() + Board.tokens.get(9).getValue()); // hardcode pentru a simula putin jocul, ceva mai inteligent TBD

            p1.printScore();
            p2.printScore();
            b.isWinner();



    }
}
