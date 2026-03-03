package com.practice.conditionloops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and breadth: ");
        double length = in.nextDouble();
        double breadth = in.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: "+ perimeter);
    }
}
