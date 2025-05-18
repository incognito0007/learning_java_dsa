package com.basicJava;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a >= 10){
            System.out.println("a is greater than 10");
        }else if (a >= 5){
            System.out.println("a is less than 10 but greater than 5");
        }else{
            System.out.println("a is less than 5");
        }

        if(a >= 10){
            System.out.println("a is greater than 10");
        }
        if (a >= 5 && a < 10){
            System.out.println("a is less than 10 but greater than 5");
        }
        else{
            System.out.println("a is less than 5");
        }

        if(a >= 10){
            System.out.println("a is greater than 10");
        }
        if (a >= 5){
            System.out.println("a is less than 10 but greater than 5");
        }
        else{
            System.out.println("a is less than 5");
        }
    }
}
