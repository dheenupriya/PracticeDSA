package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // formula: 1/2 * base * height
        System.out.println("Enter the base and height: ");
        int base = in.nextInt();
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle %.2f",area);

    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)