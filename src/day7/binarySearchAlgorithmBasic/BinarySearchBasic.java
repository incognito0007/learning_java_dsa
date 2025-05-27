package day7.binarySearchAlgorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size you want to keep for array");
        int i = sc.nextInt();
        int[] arr = new int[i];

        System.out.println("Enter the arrays value, keep it in sorted order(either Ascending or Descending)");
        inputIndexVal(arr);
        outputIndexVal(arr);
        System.out.println("Enter the target value you want to search");
        int target = sc.nextInt();

        if(binarySearch(arr, target) != -1) System.out.println("Target found at index: " + binarySearch(arr, target));
        else System.out.println("Target not found");
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

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + (end - start)/2);
            
            if(target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
