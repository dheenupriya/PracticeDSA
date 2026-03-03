package com.practice.conditionloops;

import java.util.Scanner;

public class GoOutAugust {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //August has 31 days
        int goout = 0;
        for(int i=1; i<=31; i++)
        {
            if(i%2 == 0)
            {
                goout+=1;
            }
        }
        System.out.println("Kunal can go out "+goout+ "days");
        //or
        goout = (31/2);
        System.out.println("Kunal can go out "+goout+ "days");
    }
}
