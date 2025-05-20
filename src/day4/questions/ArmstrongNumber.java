package day4.questions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++){
            if (isArmstrongNumber(i)) System.out.println(i);
        }
    }

    static boolean isArmstrongNumber(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);

            temp /= 10;
        }

        return sum == n;
    }
}
