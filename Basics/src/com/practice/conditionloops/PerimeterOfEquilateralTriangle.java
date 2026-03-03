package com.practice.conditionloops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of Triangle");
        double side = in.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle "+ perimeter);
    }
}
