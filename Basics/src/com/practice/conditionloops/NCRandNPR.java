package com.practice.conditionloops;

import java.util.Scanner;

public class NCRandNPR {
    public static void main(String[] args) {
        //nPr = n! / (n−r)! - order matters
        //nCr = n! / r!(n-r)! - order does not matter
        // n = total items
        //r = items selected
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Total number of Items and no. of items to be selected");
        int n = in.nextInt();
        int r = in.nextInt();
        int npr = factorial(n) / factorial(n - r);
        System.out.println("nPr: "+npr);
        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("nCr: "+ncr);
    }

    public static int factorial(int n)
    {
        int result = 1;
        while(n > 1)
        {
            result *= n;
            n -= 1;
        }
        return result;
    }
}
//optimization
//nPr=n×(n−1)×(n−2)×...×(n−r+1)
//nCr=n×(n−1)×(n−2)×...×(n−r+1)/r!

/*
if(r > n) return 0;
r = Math.min(r, n - r);
long result = 1;
for(int i = 0; i < r; i++) {
    result = result * (n - i) / (i + 1);
}
*/