package com.basicJava;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select 1 option:\n" +
                "1. F to C conversion\n" +
                "2. C to F conversion\n" +
                "3. C to K conversion\n" +
                "4. F to K conversion\n" +
                "5. K to C conversion\n" +
                "6. K to F conversion\n");

        int option = sc.nextInt();

        while (option <= 6 && option >= 1) {
            if (option == 1){
                System.out.print("Enter temperature in F: ");
                float fTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + fToC(fTemp));
            } else if (option == 2) {
                System.out.print("Enter temperature in C: ");
                float cTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + cToF(cTemp));
            } else if (option == 3) {
                System.out.print("Enter temperature in C: ");
                float cTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + cToK(cTemp));
            } else if (option == 4) {
                System.out.print("Enter temperature in F: ");
                float fTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + fToK(fTemp));
            } else if (option == 5) {
                System.out.print("Enter temperature in K: ");
                float kTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + kToC(kTemp));
            } else {
                System.out.print("Enter temperature in K: ");
                float kTemp = sc.nextFloat();
                System.out.println("Temperature after conversion = " + kToF(kTemp));
            }

            System.out.println();

            System.out.println("Select 1 option if you want to look for more conversion otherwise press 7 to exit:\n" +
                    "1. F to C conversion\n" +
                    "2. C to F conversion\n" +
                    "3. C to K conversion\n" +
                    "4. F to K conversion\n" +
                    "5. K to C conversion\n" +
                    "6. K to F conversion\n");

            option = sc.nextInt();
        }

        System.out.println("Please choose the right option from the given list");
    }

    public static float cToF(float temp) {
        return ((temp * 9) / 5 ) + 32;
    }

    public static  float fToC(float temp) {
        return ((temp - 32) * 5) / 9;
    }

    public static float cToK(float temp) {
        return temp + 273.15f;
    }

    public static float fToK(float temp) {
        return fToC(temp) + 273.15f;
    }

    public static float kToC(float temp) {
        return temp - 273.15f;
    }

    public static float kToF(float temp) {
        return cToF(kToC(temp));
    }
}
