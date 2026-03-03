package com.practice.conditionloops;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        //future value is basically compound interest - FV=P(1+R/100)^t
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount, rate, and time period");
        double principle = in.nextDouble();
        float rate = in.nextFloat();
        int time = in.nextInt();
        double FV = principle * Math.pow((1 + (rate/100)), time);
        System.out.println("Future Investment Value: "+ FV);
    }
}

//Important
/*
FV=P(1+r)t - interest is compounded once per year.

If bank compounds monthly, formula becomes: 𝐹𝑉=𝑃(1+𝑟/12)^12𝑡
 */