package day6.linearSearchAlgorithmQuestions;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("Max wealth = " + richestCustomerWealth(arr));
    }

    static int richestCustomerWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }
}
