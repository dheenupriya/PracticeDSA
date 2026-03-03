package com.practice.conditionloops;

import java.util.Scanner;

public class FIbonacciSeries {
    public static void main(String[] args) {
        //formula : F(n) = F(n-1) + F(n-2)
        //Enter n value - and print the series upto n.
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++)
        {
            System.out.print(a+ " ");
            int c = a + b;
            a = b;
            b = c;
        }
        in.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)
