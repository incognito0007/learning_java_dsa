package com.loopsInJava;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the position you want to find in fibonacci series: ");
        int n = sc.nextInt();

        System.out.println(n + "th term is " + nthFibonacciNumber(n));
    }

    public static int nthFibonacciNumber(int n) {
        int a = 0;
        int b = 1;

        if(n == 1) return a;
        if(n == 2) return b;
        if(n > 2) {
            for(int i = 3; i <= n; i++){
                int temp = a;
                a = b;
                b = temp + b;
            }
        }

        return b;
    }
}
