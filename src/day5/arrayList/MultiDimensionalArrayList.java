package day5.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }

        inputVal(list);
    }

    static void inputVal(ArrayList<ArrayList<Integer>> list){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);
    }
}
