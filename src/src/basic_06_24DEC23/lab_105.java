package src.basic_06_24DEC23;

import java.util.Scanner;

public class lab_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float []marks = new float[5];
        System.out.println("enter the first subject");
        marks[0] = sc.nextFloat();
        System.out.println("enter the first subject");
        marks[1] = sc.nextFloat();
        System.out.println("enter the first subject");
        marks[2] = sc.nextFloat();
        System.out.println("enter the first subject");
        marks[3] = sc.nextFloat();
        System.out.println("enter the first subject");
        marks[4] = sc.nextFloat();

        for (int i =0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

//        for (int i = 0; i < marks.length; i++) {
//            if(marks[i] < 30){
//                System.out.println("You are fail in this subject" + marks[i]);
//            }
//            System.out.println(marks[i]);
sc.close();
    }
}
