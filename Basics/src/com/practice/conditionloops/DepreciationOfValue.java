package com.practice.conditionloops;

import java.util.Scanner;
//LinearDepreciation
public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount the Product original got for");
        double amount = in.nextDouble();
        System.out.println("enter the depreciation percentage per year");
        double per = in.nextDouble();
        System.out.println("Enter the no. of years after your selling the product");
        double year = in.nextDouble();
        double depreciation = amount - ((amount)*(per/100) * year);
        if(depreciation < 0)
        {
            System.out.println("Cannot Sell the product anymore");
        }
        else
        {
            System.out.println("Can be sold for Rs."+depreciation);
        }
    }
}

/*
✅ Compound depreciation — simple idea

Each year value decreases from the current value, not original value.

So value keeps reducing again and again.

👉 Decrease → new value → decrease again → new value…

⭐ Example (very clear)

Original value = 10,000
Depreciation = 10% per year

Year 1

10,000 − 10% = 9,000

Year 2

9,000 − 10% = 8,100

Year 3

8,100 − 10% = 7,290

//double finalValue = amount * Math.pow((1 - p / 100), years);
 */