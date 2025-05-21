package day5.arraysBasic;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUsingMethods {
    public static void main(String[] args) {
        int[] num = new int[5];

        inputValue(num);
        outValue(num);
        changeValue(num, 4);
        outValue(num);
    }

    static void inputValue(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    static void outValue(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] arr, int i){
        Scanner sc = new Scanner(System.in);
        arr[i] = sc.nextInt();
   }
}
