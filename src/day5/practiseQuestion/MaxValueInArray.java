package day5.practiseQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] nums = new int[5];

        inputIndexVal(nums);
        outputIndexVal(nums);
        System.out.println("Max value : " + maxValueInsideArray(nums));
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

    static int maxValueInsideArray(int[] arr) {
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            maxVal = Math.max(maxVal, arr[i]);
        }
        return maxVal;
    }
}
