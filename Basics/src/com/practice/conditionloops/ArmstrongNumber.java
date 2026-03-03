package com.practice.conditionloops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Each digit is raised to the power of total number of digits
        //And when you add them, you get the original number.

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int length = String.valueOf(n).length();
        int result = 0;
        int temp = n;
        while(temp != 0)
        {
            int rem = temp % 10;
            result += (int) Math.pow(rem, length);
            temp = temp/10;
        }
        if(result == n)
        {
            System.out.println("It is a Armstrong Number");
        }
        else {
            System.out.println("It is not a Armstrong Number");
        }
    }
}
