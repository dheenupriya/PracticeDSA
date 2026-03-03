package com.practice.conditionloops;

import java.util.Scanner;

public class NumberIsPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        String rev = "";
        int temp = n;
        while(temp!=0)
        {
            int rem = temp % 10;
            rev += String.valueOf(rem);
            temp = temp / 10;
        }
        System.out.println(rev);
        if(String.valueOf(n).equals(rev))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrom");
        }
    }
}

/*
        int reverse = 0;

        while(n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        other method...
 */
