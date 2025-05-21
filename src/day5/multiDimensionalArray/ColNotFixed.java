package day5.multiDimensionalArray;

public class ColNotFixed {
    public static void main(String[] args) {
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        outputVal(arr2);
    }

    static void outputVal(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
