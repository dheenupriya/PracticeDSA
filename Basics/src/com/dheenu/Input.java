package com.dheenu;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some input");
        int number = input.nextInt();
        System.out.println("Your number is "+number);

        int a = 234_000_000; //you shouldnt use comma for long number
        System.out.println(a);

        float marks= input.nextFloat();
        System.out.println(marks);

    }
}
