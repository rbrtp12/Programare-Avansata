package com.company;
import java.util.Random;

import static java.lang.Math.random;

public class Tokens {
    private int value;
    private int x;
    private int y;

    public Tokens()
    {
        this.value = (int) (random() * 14 + 1); //sa zicem ca valorile posibile sunt de la 1 la 14, ca la carti
        this.x = (int) (random() * 14 + 1);
        this.y = (int) (random() * 14 + 1);

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
