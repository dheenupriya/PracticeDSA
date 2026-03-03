package com.practice.conditionloops;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        //formula: 1/3 * b * h
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height of the Pyramid: ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double volume =  (base * height)/3;
        System.out.println("Volume of Pyramid: "+ volume);
        in.close();
    }
}
