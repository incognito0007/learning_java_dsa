package main.practiseQuestion;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        numTable(num);
    }

    static void numTable(int num) {
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
