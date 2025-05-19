package day3.switchStatements;

import java.util.Scanner;

public class SwitchInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("Sweet red Fruit");
                break;

            default:
                System.out.println("Enter a valid fruit name");
        }
    }
}
