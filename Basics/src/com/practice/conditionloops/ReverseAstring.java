package com.practice.conditionloops;

import java.util.Scanner;

public class ReverseAstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.next();
        int length = s.length();
        String reverse = "";
        for(int i=length - 1; i >= 0; i--)
        {
            reverse += s.charAt(i);
        }
        System.out.println("Reverse string is "+reverse);
    }
}
