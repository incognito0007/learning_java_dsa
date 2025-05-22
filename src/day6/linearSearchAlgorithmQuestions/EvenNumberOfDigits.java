// QuestionLink --> https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

package day6.linearSearchAlgorithmQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = new int[7];
        inputIndexVal(arr);
        outputIndexVal(arr);
        System.out.println("Number of elements in the above array having even number of digits in it are: " + countOfElementsWithEvenNumberOfDigit(arr));
    }

    static void inputIndexVal(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void outputIndexVal(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    static int countOfElementsWithEvenNumberOfDigit(int[] arr) {
        int ans = 0;

        for (int num : arr) {
            if (checkEvenDigit(num)) ans++;
        }
        return ans;
    }

    static int digitCount(int num) {
        if(num == 0) return 1;
        int count = 0;
        while(num != 0){
            count++;
            num /= 10;
        }
        return count;
    }

    static boolean checkEvenDigit(int count) {
        return digitCount(count) % 2 == 0;
    }
}
