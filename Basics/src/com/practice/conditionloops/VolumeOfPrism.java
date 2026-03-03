package com.practice.conditionloops;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        //formula: (1/2*b*h) * h
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height of the triangle and Height of prism: ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double heightPrism = in.nextDouble();
        double volume = ((base*height)/2) * heightPrism;
        System.out.println("Volume of Prism: "+ volume);
        in.close();
    }
}
