package com.practice.firtstjava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = fibonacci(n); // f(n) =f(n-1) + f(n-2)
        System.out.println("Fibonaaci of N is "+ result);
    }
//    public static long fibonacci(long n)
//    {
//        if(n == 0)
//        {
//            return 0;
//        }
//        if(n==1)
//        {
//            return 1;
//        }
//        return fibonacci(n-1) + fibonacci(n-2);
//    }

    //optimized - Time: O(n), Space: O(1)
    public static long fibonacci(long n) {
        if (n <= 1) return n;

        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

}

//Fibonacci sequence is a series of numbers where:
//
//👉 Each number = sum of previous two numbers.

//Time Complexity = O(2^n)

//f(5)
// ├─ f(4)
// │   ├─ f(3)
// │   └─ f(2)
// └─ f(3)
//     ├─ f(2)
//     └─ f(1)

//👉 f(3) repeated
//👉 f(2) repeated
//👉 Many repeated calls
