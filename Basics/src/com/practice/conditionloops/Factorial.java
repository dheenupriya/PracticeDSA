package com.practice.conditionloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //formula: n! is 5! = 4 x 4 x 3 x 2 x 1
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int fact = 1;
        while(n > 1)
        {
            fact *= n;
            n -= 1;
        }
        System.out.println("Factorial of a number is "+fact);
    }
}
