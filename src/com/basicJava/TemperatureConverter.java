package com.basicJava;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select 1 option: \n" +
                "1. F to C conversion\n" +
                "2. C to F conversion\n");

        int option = sc.nextInt();

        if (option == 1){
            System.out.print("Enter temperature in F: ");
            float fTemp = sc.nextFloat();
            System.out.println("Temperature after conversion = " + fToC(fTemp));
        } else if (option == 2) {
            System.out.print("Enter temperature in C: ");
            float cTemp = sc.nextFloat();
            System.out.println("Temperature after conversion = " + cToF(cTemp));
        }
        else{
            System.out.println("Please select from the given option");
        }
    }

    public static float fToC(float temp) {
        return ((temp * 9) / 5 ) + 32;
    }

    public static  float cToF(float temp) {
        return ((temp - 32) * 5) / 9;
    }
}
