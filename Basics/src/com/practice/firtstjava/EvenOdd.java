package com.practice.firtstjava;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("It is a even Number!!!");
        }
        else
        {
            System.out.println("It is a Odd Number");
        }
        in.close(); //learned this
    }
}
/*
⭐ Interview trick (important)
Faster bit trick (advanced but useful):
num & 1
Because last binary bit decides odd/even.
even → last bit 0
odd → last bit 1
Example:
6 → 110 → even
7 → 111 → odd
if ((num & 1) == 0)
 */

/*
⭐ Time Complexity (very important — understand slowly)

Ask:
👉 Does logic depend on input size n?
No.
It runs same steps always.
1 input
1 modulo
1 if check
Constant steps.

✅ Time Complexity = O(1) (Constant)
Meaning:
Even if number is 10
or 10,000,000
steps remain same.

👉 Interview keyword: constant time

⭐ Space Complexity

Extra memory used?

Only:

int num
Scanner object


This does NOT grow with input size.

✅ Space Complexity = O(1)
 */