package com.practice.conditionloops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter product price and discount Percentage");
        double price = in.nextDouble();
        double discount = in.nextDouble();
        double discountAmount = (price * (discount/100));
        System.out.println("Discount of the product is "+ discountAmount);
        System.out.println("Customer buys for Rs."+ (price - discountAmount));
    }
}
