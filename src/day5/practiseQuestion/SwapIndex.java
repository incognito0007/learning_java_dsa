package day5.practiseQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndex {
    public static void main(String[] args) {
        int[] nums = new int[5];
        inputIndexVal(nums);
        outputIndexVal(nums);
        swapArrayIndex(nums, 0, 3);
        swapArrayIndex(nums, 4, 5);
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

    static void swapArrayIndex(int[] arr, int index1, int index2){
        if(index1 >= arr.length || index2 >= arr.length ) System.out.println("Given index " + index1 + ", " + index2 + " are out of bound");
        else{
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
            outputIndexVal(arr);
        }
    }
}
