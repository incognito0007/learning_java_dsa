package day4.questions;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 21;
//        System.out.println(isPrime(n));

        for(int i = 2; i <= n; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }

    static boolean isPrime(int n) {
        if(n <= 1) return false;
        int div = 2;

        while(div * div <= n) {
            if(n % div == 0) {
                return false;
            }
            div++;
        }

        return div * div > n;

    }
}
