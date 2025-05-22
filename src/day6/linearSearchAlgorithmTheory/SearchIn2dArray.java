package day6.linearSearchAlgorithmTheory;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        int[] ans = searchIn2dArray(arr, target);
        System.out.println(target + " is at " + Arrays.toString(ans) + " index");
        System.out.println("max value in the above array is: " + maxIn2dArray(arr));
    }

    static int[] searchIn2dArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return new int[] {row, col};
            }
        }
        return new int[] {-1, -1};
    }

    static int maxIn2dArray(int[][] arr) {
        int maxValue = arr[0][0];

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(arr[row][col] > maxValue) maxValue = arr[row][col];
//            }
//        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > maxValue) maxValue = anInt;
            }
        }
        return maxValue;

    }
}
