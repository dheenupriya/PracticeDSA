package com.functionPrograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = in.nextInt();
        PrimeNumber(a);
    }
    private static void PrimeNumber(int a)
    {
        boolean isPrime = true;

        if(a <= 1) {
            isPrime = false;
        }

        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("It is prime number");
        }
        else
        {
            System.out.println("It is not prime number");
        }
    }
}
