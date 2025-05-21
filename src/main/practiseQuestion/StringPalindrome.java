package main.practiseQuestion;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        }
        return true;
    }
}
