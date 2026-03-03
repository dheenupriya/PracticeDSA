package com.practice.conditionloops;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount the product sold for: ");
        double productCost = in.nextDouble();
        System.out.println("Enter the commision earned");
        double commission = in.nextDouble();
        double commissionPercentage = (commission / productCost) * 100;
        System.out.println("Commission Percentange "+ commissionPercentage+"%");
    }
}
//Time - O(1)
//space - O(1)
