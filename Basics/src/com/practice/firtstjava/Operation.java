package com.practice.firtstjava;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the Operation number you want to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        double result;
        int chosen = in.nextInt();
        if(chosen == 1)
        {
            result = a + b;
        }
        else if(chosen == 2)
        {
            result = a - b;
        }
        else if(chosen == 3)
        {
            result = a * b;
        }
        else if(chosen == 4)
        {
            if (b == 0)
            {
            System.out.println("Division by zero not allowed");
            in.close();
            return;
            }
            result = (double) a / b; // just a/b will give integer value that 0.5 will be 0 as result. So we need to cast it.
        }
        else
        {
            System.out.println("Invalid choice");
            in.close();
            return;
        }
        System.out.printf("Operation Result: %2f", result);
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)