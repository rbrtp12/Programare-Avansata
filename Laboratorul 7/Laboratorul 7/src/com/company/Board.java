package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Board
{
    public static List<Tokens> tokens = new ArrayList<Tokens>();
    public List<Player> players = new ArrayList<Player>();

    public Board() {

    }

    void isWinner()
    {
        System.out.println("A castigat " + players.stream().max(comparing(Player::getScore)).get());
    }


}