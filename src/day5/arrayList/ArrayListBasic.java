package day5.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        //initial capacity 10 --> doesn't mean that we can only add upto 10 values, we can add as many values as we want

        list.add(67);
        list.add(677);
        list.add(637);
        System.out.println(list);

        list.set(1, 45);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        inputVal(list);
        System.out.println(list);

        System.out.println(list.get(7));
    }

    static void inputVal(ArrayList<Integer> list){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i++){
            list.add(sc.nextInt());
        }
    }
}
