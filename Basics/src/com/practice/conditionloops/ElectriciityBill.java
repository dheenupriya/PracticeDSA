package com.practice.conditionloops;

import java.util.Scanner;

public class ElectriciityBill {
    public static void main(String[] args) {

        /*
            👉 Often free (for many domestic users) 0 – 100 units
            👉 Around ₹2.25 per unit - 101 – 200 units
            👉 Around ₹4.50 per unit - 201 – 400 units
            👉 Around ₹6.00 per unit - 401 – 500 units
            👉 Around ₹8.00+ per unit - Above 500 units
         */

        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        if(units <= 100)
        {
            System.out.println("Current Bill is Rs.0");
        }
        else if(units >= 101 && units <=200)
        {
            System.out.println("Current Bill is Rs."+(units * 2.25));
        }
        else if(units >= 201 && units <=400)
        {
            System.out.println("Current Bill is Rs."+(units * 4.50));
        }
        else if(units >= 401 && units <=500)
        {
            System.out.println("Current Bill is Rs."+(units * 6.00));
        }
        else if(units > 500)
        {
            System.out.println("Current Bill is Rs."+(units * 8.00));
        }

    }
}
