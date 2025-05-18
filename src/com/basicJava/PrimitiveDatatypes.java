package com.basicJava;

public class PrimitiveDatatypes {
    public static void main(String[] args) {
        String name = "Ankit Anand";  //String is not primitive datatype
        int rollNo = 8005;
        long prnNo = 22010787L;
        float cgpa = 8.96f;
        double percentage = 76.6789543;
        boolean isSppuStudent = true;

        if(isSppuStudent){
            System.out.println("Student info:\nName: " + name +
                    "\nRoll Number: " + rollNo +
                    "\nPRN Number: " + prnNo +
                    "CGPA: " + cgpa +
                    "\nPercentage: " + percentage);
        }
    }
}