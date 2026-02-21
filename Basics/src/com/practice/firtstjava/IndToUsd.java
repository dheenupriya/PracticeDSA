package com.practice.firtstjava;

import java.util.Scanner;

public class IndToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Amount in Rupees");
        long rupee = in.nextLong();
        double usd = rupee/90.9416; //exchange rate today
        System.out.printf("USD: %2f", usd);
    }
}

//Time Complexity - O(1)
//Space Complexity - O(1)
