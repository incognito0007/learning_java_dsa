package day3.nestedSwitchStatements;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String dept = sc.next();

        switch (empId) {
            case 1:
                System.out.println("Ankit");
                break;
            case 2:
                System.out.println("Anku");
                break;
            case 3:
                System.out.println("Ankit Anand");
                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "SDE":
                        System.out.println("SDE department");
                        break;
                    default:
                        System.out.println("not a valid department");
                }
                break;
            default:
                System.out.println("not a valid empId");
        }
    }
}
