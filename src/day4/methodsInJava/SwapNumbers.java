package day4.methodsInJava;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("Before swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("After swap");
        swapNumbers(a, b);

    }

    static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
