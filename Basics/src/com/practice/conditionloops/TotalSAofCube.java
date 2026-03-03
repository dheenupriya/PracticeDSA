package com.practice.conditionloops;

import java.util.Scanner;

public class TotalSAofCube {
    public static void main(String[] args) {
        //formula: 6 * a^2
        Scanner in = new Scanner(System.in);
        System.out.println("Enter side of the cube: ");
        double side = in.nextDouble();
        double SA = 6 * (side*side);
        System.out.println("SA of Cyclinder: "+ SA);
        in.close();
    }
}
