package com.practice.conditionloops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //formula: Volume=1/3 * πr^2 * h
        System.out.println("Enter radius and height of the cone: ");
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double volume = ((Math.PI * radius*radius) * height)/3;
        System.out.println("Volume of Cone: "+ volume);
    }
}
