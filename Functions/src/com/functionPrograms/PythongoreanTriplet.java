package com.functionPrograms;

import java.util.Scanner;

public class PythongoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 values");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(c*c == (a*a + b*b))
        {
            System.out.println("It is a Pythongorean Triplet");
        }else {
            System.out.println("It is not Pythongorean Triplet");
        }
    }
}
