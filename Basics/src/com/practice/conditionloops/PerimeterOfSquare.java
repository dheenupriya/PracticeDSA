package com.practice.conditionloops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of the square: ");
        double side = in.nextDouble();
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: "+ perimeter);
    }
}
