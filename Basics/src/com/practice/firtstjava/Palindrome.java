package com.practice.firtstjava;

import java.util.Scanner;

//Two pointer technique
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String pal = s.next();
        pal = pal.toLowerCase();
        int left = 0;
        int right = pal.length()-1;
        boolean palindrome = true;
        while(left < right)
        {
            if(pal.charAt(left) == pal.charAt(right))
            {
                left++;
                right--;
            }
            else {
                palindrome = false;
                break;
            }
        }
        if(palindrome)
        {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a Palindrome");
        }

    }
}

//Time complexiity: O(n) - as string length increases while increases
//space Complexity: O(1)

//Shorter code

//        while (left < right) {
//              if (pal.charAt(left) != pal.charAt(right)) {
//              palindrome = false;
//              break;
//          }
//          left++;
//          right--;
//        }