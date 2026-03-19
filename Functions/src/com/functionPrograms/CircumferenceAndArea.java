package com.functionPrograms;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int  r = in.nextInt();
        Circumference(r);
        area(r);
    }
    private static void Circumference(int r)
    {
        System.out.println("Circumference is "+(2 * Math.PI * r));
    }
    private static void area(int r)
    {
        System.out.println("Area is "+(Math.PI * r * r));
    }
}
