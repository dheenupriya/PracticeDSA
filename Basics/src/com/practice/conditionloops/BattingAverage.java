package com.practice.conditionloops;


import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        //Batting Average = Total Runs / Number of Outs
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Total Runs and Number of outs");
        int runs = in.nextInt();
        int outs = in.nextInt();
        System.out.println("Batting Average: "+(runs/outs));
    }
}
