package day4.advanceMethodsInJava;

public class Shadowing {
    static int a = 10; //This can be used anywhere which is under class Shadowing
    // The above value is get shadowed at line 11, basically at line number 11 the value of 'a' is using main method scope where a = 40
    //while on line number 9, 'a' is coming from Shadowing class

    public static void main(String[] args) {
        System.out.println(a);
        int a = 40;
        System.out.println(a);
        fun();
    }

    private static void fun() {
        System.out.println(a);
        int a = 700;
        System.out.println(a);
    }
}
