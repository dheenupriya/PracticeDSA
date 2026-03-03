package com.practice.conditionloops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 points (x1,y1) and (x2,y2): ");
        // distance = √(x2 - x1)^2 + (y2 - y1)^2
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double distance = Math.sqrt((Math.pow(x2 - x1,2) + (Math.pow(y2 - y1,2))));
        System.out.println("Distance is "+distance);

    }
}
//Time - O(1)
//space - O(1)
/*
double dx = x2 - x1;
double dy = y2 - y1;

double distance = Math.sqrt(dx * dx + dy * dy);
Why this is better:

avoids Math.pow overhead
more readable
standard interview style
 */