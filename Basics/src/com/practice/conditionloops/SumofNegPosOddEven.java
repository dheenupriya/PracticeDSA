package com.practice.conditionloops;

import java.util.Scanner;

public class SumofNegPosOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n numbers u want to enter");
        int n = in.nextInt();
        System.out.println("Enter the numbers");
        int negNum = 0;
        int PosEven = 0;
        int PosOdd = 0;
        for(int i=0; i<n; i++)
        {
            int num = in.nextInt();
            if(num < 0)
            {
                negNum+=num;
            }
            else if(num > 0 && num%2==0)
            {
                PosEven+=num;
            }
            else
            {
                PosOdd+=num;
            }
        }
        System.out.println("Sum of Negative Numbers: "+negNum);
        System.out.println("Sum of Positive Even Numbers: "+PosEven);
        System.out.println("Sum of Positive Odd Numbers: "+PosOdd);
    }
}
