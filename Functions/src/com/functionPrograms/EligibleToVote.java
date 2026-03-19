package com.functionPrograms;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ur age");
        int age = s.nextInt();
        System.out.println(eligibility(age));
    }
    private static String eligibility(int age)
    {
        if(age >= 18)
        {
            return "Eligible to vote";
        }
        else
        {
            return "Uneligible to vote";
        }
    }

}
