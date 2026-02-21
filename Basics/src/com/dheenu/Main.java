package com.dheenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Scanner input = new Scanner(System.in); //System.in means the keyboard input from the system
        System.out.println(input.nextInt()); //read integer
        System.out.println(input.next()); //read string

        int c = 1;
        while(c != 5)
        {
            System.out.println(c);
            c++;
        }

    }
}