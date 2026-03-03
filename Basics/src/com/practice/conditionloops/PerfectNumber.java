package com.practice.conditionloops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        //A number that is equal to the sum of its proper divisors
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++)
        {
            if(n%i == 0)
            {
                sum+=i;
                if(i != n/i)
                {
                    sum+=(n/i);
                }
            }
        }
        sum-=n; //removing n value as it would have been added in loop. i.e 1,2,3,6 - would have been added. we need to remove 6
        if(sum == n)
        {
            System.out.println("It is a PerfectNumber");
        }
        else
        {
            System.out.println("It is not a PerfectNumber");
        }
    }
}
//simple method: for(int i = 1; i <= n/2; i++)