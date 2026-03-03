package com.practice.conditionloops;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Keep entering numbers until you want. To stop enter 0");
        int sum = 0;
        int i = in.nextInt();
        while(i != 0)
        {
            sum +=i;
            i = in.nextInt();
        }
        System.out.printf("Sum is %d", sum);
    }
}

//time complexity - O(n)
//space complexity - O(1)