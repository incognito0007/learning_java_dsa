package main.practiseQuestion;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        System.out.println(isLeap(year));
    }

    static boolean isLeap(int year) {
        return year % 4 == 0;
    }
}
