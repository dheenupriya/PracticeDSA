package com.functionPrograms;

import java.util.Scanner;

public class ProductOf2Nos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a, b);
    }
    private static void sum(int a, int b)
    {
        System.out.println("Product is "+(a * b));
    }
}
