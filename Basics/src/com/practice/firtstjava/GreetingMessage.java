package com.practice.firtstjava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = s.next();
        System.out.println("Konnichiwa "+name+"san, Yorosiku Onegaishimasu");
    }
}

//Time complexity - O(1)
//Space complexity - O(1)
