package com.dheenu;

import java.io.OutputStream;
import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        //typecasting
        int flo = (int) (67.23f);
        System.out.println(flo);

        //automatic type promotion in expression
        //1 byte = 8bits - 8bits can store -128 to 127 - total 256.
        //-128  to  -1   → 128 values
        //0     to  127  → 128 values

        int a = 245;
        byte b = (byte)(a);
        System.out.println(b);
        int c = 257;
        byte d = (byte)(c);//257 % 256 = 1
        System.out.println(d);

        byte h = 40;
        byte s = 50;
        byte k = 100;
        int r = (h + s) / k; //byte gets automaticlly converted to int in java. becz byte * byte value which is large cannot be stored
        System.out.println(r);

        //evaluation automatically changes to int even if it byte.

        int number = 'A';
        System.out.println(number);
        //converts to ascii number

        //smaller ones will be convert to bigger one
        byte by = 42;
        char ch = 'a';
        short sh = 1024;
        int i = 50000;
        float fl = 5.67f;
        double dou = 0.1234;
        double result = (fl * by) + (i/ch) - (dou * sh);
        System.out.println((fl * by) + " " + (i/ch)  + " " + (dou * sh));
        System.out.println(result);


    }
}
