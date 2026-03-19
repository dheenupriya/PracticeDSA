package com.functionPrograms;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = s.nextInt();
        System.out.println("Number is "+ oddEven(a));
    }

    private static String oddEven(int a)
    {
        if(a%2==0)
        {
            return "Even";
        }
        else {
            return "Odd";
        }
    }
}
