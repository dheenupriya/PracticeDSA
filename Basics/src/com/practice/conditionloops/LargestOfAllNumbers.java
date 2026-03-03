package com.practice.conditionloops;

import java.util.Scanner;

public class LargestOfAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Keep entering numbers until you want. To stop enter 0");
        int i = in.nextInt();
        int largest = i; //edge case . if user enter 0 - this will print the largest is 0 - but 0 is for exit
        while(i != 0)
        {
            if( i > largest)
            {
                largest = i;
            }
            i = in.nextInt();
        }
        System.out.printf("Largest is %d", largest);
    }
}
/*
        int largest = Integer.MIN_VALUE;

        while (true) {
            int n = in.nextInt();

            if (n == 0) break;

            if (n > largest) {
                largest = n;
            }
        }
 */