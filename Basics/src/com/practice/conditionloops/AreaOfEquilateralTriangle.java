package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        //formula: (root(3)/4) * a^2
        System.out.println("Enter the side of the triangle");
        double a = in.nextDouble();
        double  area = (Math.sqrt(3) / 4) * (a*a);
        System.out.printf("Area of Equilateral Triangle: %.2f", area);

    }
}
