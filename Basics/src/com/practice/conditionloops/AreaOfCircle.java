package com.practice.conditionloops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double a = s.nextDouble();
        double area = Math.PI * Math.pow(a,2);// Math.PI * a * a
        System.out.println("Area of circle is "+area);
//        Using Math.pow() is unnecessary here.
//        Because exponent = 2 → simple multiplication is faster.
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)