package com.practice.conditionloops;

import java.util.Scanner;

public class LCMofTwoNumbers {
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
//If algorithm keeps:
//
//👉 Dividing problem size
//or
//👉 Cutting problem in half
//
//It is usually O(log n)
/*
Let’s say n = 16
Divide by 2 each time:
16 → 8 → 4 → 2 → 1
How many steps?
4 steps.
And:
log2(16)=4
//HCF×LCM=a×b
 */