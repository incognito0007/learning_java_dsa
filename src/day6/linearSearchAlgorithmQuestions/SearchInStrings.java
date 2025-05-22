package day6.linearSearchAlgorithmQuestions;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String target = in.next();
        System.out.println(charSearchInString(str, target.charAt(0)));
    }

    static int charSearchInString(String str, char target) {
        if(str.isEmpty()) return -1;

        for (int i = 0; i < str.length(); i++){
            char element = str.charAt(i);
            if(element == target) return i;
        }

        return -1;
    }
}
