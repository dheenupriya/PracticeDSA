package com.practice.conditionloops;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Keep entering numbers until you want. To stop enter 0");
        int sum = 0;
        int i = in.nextInt();
        int len = 0;
        while(i != 0)
        {
            sum +=i;
            len +=1;
            i = in.nextInt();
        }
        System.out.printf("Average is %d", (sum/len));
    }
}
