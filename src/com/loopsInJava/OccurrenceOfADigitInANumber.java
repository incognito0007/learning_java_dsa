package com.loopsInJava;

import java.util.Scanner;

public class OccurrenceOfADigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long n = sc.nextLong();
        System.out.println("Enter the digit you want to find: ");
        int a = sc.nextInt();

        System.out.println("Number of times " + a + " appeared in " + n + " is " + occurrenceOfDigit(n, a));
    }

    public static int occurrenceOfDigit(long n, int a) {
        int count = 0;

        while(n > 0){
            if(n % 10 == a) count++;

            n = n/10;
        }

        return count;
    }
}
