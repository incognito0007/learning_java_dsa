package day4.methodsInJava;

public class ChangeValueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        changeValue(arr);
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
    }

    static void changeValue(int[] nums) {
        nums[0] = 99;
    }
}
