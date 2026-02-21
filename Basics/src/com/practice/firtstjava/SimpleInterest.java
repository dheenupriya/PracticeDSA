package com.practice.firtstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principal, Time and Rate ");
        double principal = s.nextDouble();
        double time = s.nextDouble();
        double rate = s.nextDouble();
        double simpleInterest = (principal * time * rate)/100;
        System.out.printf("Simple Interest is %.2f",simpleInterest); //learnt
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)