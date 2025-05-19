package com.ifElseStatements;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        System.out.println("input character is " + caseCheck(ch));
    }

    public static String caseCheck(char ch){
        if(ch >= 65 && ch <= 90) return "Upper case";
        else return "Lowercase";
    }
}
