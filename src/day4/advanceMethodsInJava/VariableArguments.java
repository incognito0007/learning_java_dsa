package day4.advanceMethodsInJava;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        varArgs(5, 37, 93, 11, 27, 63, 79);
    }

    static void varArgs(int ...x) {
        System.out.println(Arrays.toString(x));
    }
}
