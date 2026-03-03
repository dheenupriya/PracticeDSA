package com.practice.conditionloops;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        //formula: 4/3 8 pi * r^3
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of the Sphere: ");
        double radius = in.nextDouble();
        double volume = (4 * Math.PI * radius * radius * radius)/3;
        System.out.println("Volume of Sphere: "+ volume);
        in.close();
    }
}
