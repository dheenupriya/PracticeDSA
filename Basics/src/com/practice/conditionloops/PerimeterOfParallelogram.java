package com.practice.conditionloops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side1 and side2: ");
        double side1 = in.nextDouble();
        double side2 = in.nextDouble();
        double perimeter = 2 * (side1 + side2);
        System.out.println("Perimeter of Parallelogram: "+perimeter);
    }
}
