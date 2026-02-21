package com.dheenu;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the temp in C: ");
        float tempC = s.nextFloat();
        float tempF = (tempC * 9/5) +32;
        System.out.println(tempF);
    }
}
