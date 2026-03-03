package com.practice.conditionloops;

import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        System.out.println("Enter the Length and Breadth of Rectangle");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();
        int area = length * breadth;
        System.out.printf("Area of Rectangle %d", area);
    }
}
