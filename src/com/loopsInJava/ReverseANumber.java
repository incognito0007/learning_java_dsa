package com.loopsInJava;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Reverse of " + n + " is " + reverseNumber(n));
    }

    public static long reverseNumber(long n) {
        long res = 0L;

        while(n > 0){
            res = (res * 10) + (n % 10);

            n = n/10;
        }

        return res;
    }
}
