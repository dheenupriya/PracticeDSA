package com.practice.conditionloops;

import java.util.Scanner;

public class CompounInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //s.i = (p * r * t) / 100
        //c.i = p * (1 + r/100) ^t
        System.out.println("Enter the principle, rate of interest, time: ");
        double principle = in.nextDouble();
        double rate = in.nextDouble();
        float time = in.nextFloat();
        double profitAmount = principle * Math.pow((1 + (rate/100)), time);
        System.out.println("Compound Interest is "+ (profitAmount - principle));
    }
}
