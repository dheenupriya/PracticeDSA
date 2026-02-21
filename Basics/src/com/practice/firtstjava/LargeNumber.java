package com.practice.firtstjava;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if( a > b )
        {
            System.out.println(a + " is greater than "+b);
        }
        else
        {
            System.out.println(b + " is greater than "+a);
        }
    }
}

//Time Complexity: O(1)
//Space Complexity: O(1)
