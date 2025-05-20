package day4.advanceMethodsInJava;

public class MethodOverloading {
    public static void main(String[] args) {

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }

    static void fun(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    static void fun(String greet, int num){
        System.out.println(greet);
        System.out.println(num);
    }
}
