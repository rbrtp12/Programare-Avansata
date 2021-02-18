package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static int digitSum(int a)
    {
        int sum=0;
        while(a>0 || sum > 9)
        {
            if(a == 0)
            {
                a = sum;
                sum = 0;
            }
            sum += a%10;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println("Hello World");
        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        int result = ((n*3) + 0b10101 + 0xFF) * 6;
        System.out.println(result);
        System.out.println(digitSum(result));
        System.out.println("Willy-nilly, this semester I will learn " + languages[digitSum(result)]);




    }
}
