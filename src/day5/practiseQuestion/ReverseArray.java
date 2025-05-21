package day5.practiseQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = new int[5];

        inputIndexVal(nums);
        outputIndexVal(nums);
        reverseAnArray(nums);
        reverseArrayUsingSwapMethod(nums);
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

    static void reverseAnArray(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        outputIndexVal(arr);
    }

    static void reverseArrayUsingSwapMethod(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end) {
            swapArrayIndex(arr, start, end);
            start++;
            end--;
        }

        outputIndexVal(arr);
    }

    static void swapArrayIndex(int[] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
}
