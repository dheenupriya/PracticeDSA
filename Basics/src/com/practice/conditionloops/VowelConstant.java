package com.practice.conditionloops;

import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String vowel = "aeiou";
        System.out.println("Enter a character");
        char letter = in.next().charAt(0);
        boolean vow = false;
        for(int i = 0; i< vowel.length(); i++)
        {
            if(vowel.charAt(i) == letter)
            {
                System.out.println("It is a vowel");
                vow = true;
                break;
            }
        }
        if(!vow)
        {
            System.out.println("It is a constant");
        }
    }
}
//Time complexity: O(1)
