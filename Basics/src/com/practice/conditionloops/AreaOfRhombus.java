package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        //formula: d1*d2 / 2 : d1 and d2 are diagonals
        System.out.println("Enter the daigonals length d1 and d2: ");
        Scanner in = new Scanner(System.in);
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        double area = (d1 * d2) /2;
        System.out.println("Area of Rhombus: "+ area);

    }
}
