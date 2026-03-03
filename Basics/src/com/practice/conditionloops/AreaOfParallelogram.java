package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width and height: ");
        double width = in.nextDouble();
        double height = in.nextDouble();
        System.out.println("Area of parallelogram: "+(width * height));

    }
}
