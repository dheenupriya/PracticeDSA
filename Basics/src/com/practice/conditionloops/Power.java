package com.practice.conditionloops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and exponent");
        int base = in.nextInt();
        int exponent = in.nextInt();
        System.out.println("Power: "+ Math.pow(base,exponent));
    }
}
