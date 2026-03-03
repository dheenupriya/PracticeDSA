package com.practice.conditionloops;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        //CGPA = Sum of grade points of all subjects / Number of subjects
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        int subjects = in.nextInt();
        float totalScore = 0;
        for(int i = 0; i < subjects; i++)
        {
            System.out.println("Enter the subject"+(i+1)+" grade");
            totalScore += in.nextFloat();
        }
        System.out.printf("CGPA: %.2f",(totalScore/subjects));
    }
}
