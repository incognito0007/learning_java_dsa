package main.practiseQuestion;

import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("LCM = " + lcm(num1, num2));
        System.out.println("HCF = " + hcf(num1, num2));
    }

    static int hcf(int num1, int num2) {
        while(num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    static int lcm(int num1, int num2) {
        return (num1 * num2)/hcf(num1, num2);
    }
}
