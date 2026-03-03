package com.practice.conditionloops;

import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int hcf = hcf(a, b);
        System.out.println("HCF: "+hcf);

    }
    public static int hcf(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }
}
//HCF: largest number that divides both numbers exactly.
//LCM: smallest number that divides both numbers exactly.
//HCF(a, b) = HCF(b, a % b) - fastest way