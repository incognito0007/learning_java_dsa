package day6.linearSearchAlgorithmQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        inputIndexVal(arr);
        System.out.println("Enter the target value you want to search");
        int target = sc.nextInt();

        System.out.println("Enter range starting value: ");
        int rangeStart = sc.nextInt();
        System.out.println("Enter range ending value: ");
        int rangeEnd = sc.nextInt();

        outputIndexVal(arr);

        System.out.println(rangeSearch(arr, rangeStart, rangeEnd, target));
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

    static boolean rangeSearch(int[] arr, int start, int end, int target) {
        if(start >= arr.length || end >= arr.length || start < 0 || end < 0) {
            System.out.println("Selected range is out of bound");
            return false;
        }

        if(arr.length == 0) return false;

        for(int i = start; i <= end; i++) {
            if(arr[i] == target) return true;
        }
        return false;
    }
}
