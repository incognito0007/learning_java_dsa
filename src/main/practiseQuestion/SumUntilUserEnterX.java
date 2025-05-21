package main.practiseQuestion;

import java.util.Scanner;

public class SumUntilUserEnterX {
    public static void main(String[] args) {
        System.out.println("Sum = " + sum());
    }

    static int sum(){
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter number to sum, Type 'x' to stop");

        while(true){
            String input = in.next();

            if(input.equalsIgnoreCase("x")) break;

            try {
                int num = Integer.parseInt(input);
                sum += num;
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. please enter a number or 'x' to exit");
            }
        }
        return sum;
    }
}
