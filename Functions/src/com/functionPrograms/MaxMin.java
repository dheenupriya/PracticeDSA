package com.functionPrograms;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("Min number is "+ minimum(a, b, c));
        System.out.println("Max number is "+ maximum(a, b, c));
    }

    private static int minimum(int a, int b, int c)
    {
        if(a <= b && a <= c) {
            return a;
        }
        else if(b <= a && b <= c)
        {
            return b;
        }
        else{
            return c;
        }
    }
    private static int maximum(int a, int b, int c)
    {
        if(a >= b && a >= c) {
            return a;
        }
        else if(b >= a && b >= c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}
