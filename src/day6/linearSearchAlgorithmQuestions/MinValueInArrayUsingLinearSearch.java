package day6.linearSearchAlgorithmQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArrayUsingLinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        inputIndexVal(arr);
        outputIndexVal(arr);
        System.out.println("Min value in the above array is: " + minValueInArray(arr));
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

    static int minValueInArray(int[] arr) {
        int minVal = arr[0];

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] < minVal) minVal = arr[i+1];
        }
        return minVal;
    }
}
