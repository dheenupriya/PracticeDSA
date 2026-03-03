package com.practice.conditionloops;

import java.util.Scanner;

public class VolumeOfCyclinder {
    public static void main(String[] args) {
        //formula: pi* r^2 * h
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius and height of the Cyclinder: ");
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cycliner: "+ volume);
        in.close();
    }
}
