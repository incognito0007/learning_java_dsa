package day5.multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        inputVal(arr);
        outputVal(arr);
    }

    static void inputVal(int[][] arr) {
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }
    }

    static void outputVal(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
