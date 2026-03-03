package com.practice.conditionloops;


import java.util.Scanner;

public class PerimeterOfCircle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        double r = in.nextDouble();
        double area = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle: "+area);
    }
}
