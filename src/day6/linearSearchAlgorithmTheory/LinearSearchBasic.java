package day6.linearSearchAlgorithmTheory;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        inputIndexVal(arr);
        System.out.println("Enter the target value you want to search");
        int target = sc.nextInt();
        outputIndexVal(arr);
        System.out.println(target + " is at " + linearSearchForNumber(arr, target) + " index inside the array");
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

    static int linearSearchForNumber(int[] arr, int target) {
        if(arr.length == 0) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
