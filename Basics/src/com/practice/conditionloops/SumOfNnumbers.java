package com.practice.conditionloops;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n number and the enter those numbers");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += in.nextInt();
        }
        System.out.println("Sum of n numbers: "+sum);
    }
}
