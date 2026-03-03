package com.practice.conditionloops;

import java.util.Scanner;

public class CurvedSAofCyclinder {
    public static void main(String[] args) {
        //formula: 2 * pi * r * h
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius and height of the cyclinder: ");
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double SA = 2 * Math.PI * radius * height;
        System.out.println("SA of Cyclinder: "+ SA);
        in.close();
    }
}
