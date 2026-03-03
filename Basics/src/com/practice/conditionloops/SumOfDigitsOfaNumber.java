package com.practice.conditionloops;

import java.util.Scanner;

public class SumOfDigitsOfaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a long digit");
        Long digit = in.nextLong();
        Long sum = 0L;
        while(digit != 0)
        {
            Long rem = digit%10;
            sum+=rem;
            digit = digit/10;
        }
        System.out.println("Sum of Digits of a number: "+sum);
    }
}
//time complexity: O(logn)