package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //formula: b/4 * root(4 * a^2 - b^2) - a is side, b is base
        System.out.println("Enter the base and side of the triangle");
        //isosceles have two equal side in a triangle
        double side = in.nextDouble();
        double base = in.nextDouble();
        double area = (base / 4) * Math.sqrt((4*side*side) - (base*base));
        System.out.printf("Area of Isosceles Triangle %.2f", area);
    }
}
//Time complexity: O(1)
//Space complexity: O(1)