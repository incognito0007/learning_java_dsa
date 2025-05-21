package day5.arraysBasic;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Store 5 Roll Numbers
        int[] rollNo = new int[5];
        int[] prnNo = {27, 31, 43, 84, 74};

        System.out.println(prnNo[4]);
        System.out.println(Arrays.toString(prnNo));

        for (int i = 0; i < rollNo.length; i++) {
            rollNo[i] = sc.nextInt();
        }

        for (int j : rollNo) {
            System.out.print(j + " ");
        }
    }
}