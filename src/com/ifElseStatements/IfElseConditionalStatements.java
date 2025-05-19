package com.ifElseStatements;

import java.util.Scanner;

public class IfElseConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of all three Integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Greatest of three is from first method " + largestOfThreeMethodOne(a, b, c));
        System.out.println("Greatest of three is from second method " + largestOfThreeMethodTwo(a, b, c));
        System.out.println("Greatest of three is from third method " + largestOfThreeMethodThree(a, b, c));
        System.out.println("Greatest of three is from fourth method " + largestOfThreeMethodFour(a, b, c));
    }

    public static int largestOfThreeMethodOne(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    public static int largestOfThreeMethodTwo(int a, int b, int c) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;

        return max;
    }

    public static int largestOfThreeMethodThree(int a, int b, int c) {
        int max = 0;

        if(a > b){
            max = a;
        }else {
            max = b;
        }

        if(c > max) max = c;

        return max;
    }

    public static int largestOfThreeMethodFour(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
