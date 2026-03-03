package com.practice.conditionloops;

import java.util.Scanner;

public class ProductMinusSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int product = 1;
        int temp = n;
        while(temp != 0)
        {
            int rem = temp % 10;
            product *= rem;
            temp = temp/10;
        }
        temp = n;
        int add = 0;
        while(n != 0)
        {
            int rem = n % 10;
            add += rem;
            n = n/10;
        }
        System.out.println(product - add);
    }
}

//Time complexity: O(n) + O(n) = O(2n). in Big O - we drop constants.
// So it is O(n). similarly, even if it O(6n) - it will be O(n)

//Beteer solution
/*
        while(temp != 0)
        {
            int rem = temp % 10;
            product *= rem;
            add += rem;
            temp = temp/10;
        }
 */