package main.practiseQuestion;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int t = in.nextInt();
        int r = in.nextInt();

        System.out.println("Simple Interest = " + simpleInterest(p, t, r));
    }

    static int simpleInterest(int principle, int time, int rate) {
        return (principle * time * rate)/100;
    }
}