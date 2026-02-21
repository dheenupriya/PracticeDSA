package com.practice.firtstjava;

import java.util.Scanner;
//An Armstrong number is a number where:
//
//        👉 Sum of each digit raised to the power of number of digits
//        = the number itself.

//⭐ Example 1 (classic)
//        153
//
//Digits = 1, 5, 3
//Number of digits = 3
//
//Calculate:
//
//        1³ + 5³ + 3³
//        = 1 + 125 + 27
//        = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range of 2 numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i = a; i <= b; i++)
        {
            if(armstrong(i))
            {
                System.out.println(i);
            }
        }
    }
    public static boolean armstrong(int n) {
        String number = String.valueOf(n);
        int len = number.length();
        int sum = 0;
        for(int i = 0; i < len; i++)
        {
            sum += Math.pow(number.charAt(i) - '0', len); //int digit = number.charAt(i) - '0'; doing (int) will convert to ascii
        }
        return sum == n;
    }
}

//The solution is already optimal. For faster working we can do the below method
/*
public static boolean armstrong(int n) {
    int original = n;

    int len = countDigits(n);
    int sum = 0;

    while (n != 0) {
        int digit = n % 10;
        sum += Math.pow(digit, len);
        n /= 10;
    }

    return sum == original;
}

public static int countDigits(int n) {
    if (n == 0) return 1;

    int count = 0;
    while (n != 0) {
        count++;
        n /= 10;
    }
    return count;
}

 */