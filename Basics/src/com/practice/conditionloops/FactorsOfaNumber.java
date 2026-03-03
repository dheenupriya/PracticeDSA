package com.practice.conditionloops;

import java.util.Scanner;

public class FactorsOfaNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        for(int i = 1; i <= Math.sqrt(n); i++) //important - √n * √n = n (i.e) 6 x 6 = 36 - after this pair repeats reverse. so we top it here.
        {
            if(n%i == 0)
            {
                System.out.print(i + " ");
                if (i != n / i) {                   // avoid duplicate (perfect square)
                    System.out.print(n / i + " ");  // pair factor
                }
            }
        }
    }
}
//Time complexity = O(√n)
//space complexty = O(1)