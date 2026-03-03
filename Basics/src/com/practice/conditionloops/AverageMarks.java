package com.practice.conditionloops;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 5 subject Marks:");
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        int s4 = in.nextInt();
        int s5 = in.nextInt();
        System.out.println("Average Marks: "+((s1+s2+s3+s4+s5)/5));
    }
}
