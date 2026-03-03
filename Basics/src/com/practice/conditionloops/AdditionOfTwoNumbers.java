package com.practice.conditionloops;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Addition of Two numbers is "+ (a+b));
    }
}
