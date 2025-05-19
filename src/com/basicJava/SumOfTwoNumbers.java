package com.basicJava;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        System.out.println("Sum of those two integer = " + sumOfTwoNumbers(a, b));
    }

    public static int sumOfTwoNumbers(int a, int b){
        return a + b;
    }
}