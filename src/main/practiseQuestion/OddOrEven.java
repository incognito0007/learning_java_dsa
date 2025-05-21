package main.practiseQuestion;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        oddOrEven(num);
    }

    static void oddOrEven(int num) {
        if(num % 2 == 0) System.out.println(num + " is even");
        else System.out.println(num + " is odd");
    }
}
