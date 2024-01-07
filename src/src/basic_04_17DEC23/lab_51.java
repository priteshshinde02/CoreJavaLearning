package src.basic_04_17DEC23;

import java.util.Scanner;

public class lab_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int  number = sc.nextInt();

        if(number >=90) {
            System.out.println("Grade is A");
        } else if (number >=80) {
            System.out.println("Grade is B");
        } else if (number >=70) {
            System.out.println("Grade is C");
        } else if (number >=60) {
            System.out.println("Grade is D");
        }else {
            System.out.println("Grade is F");
        }
    }
    }

//            if (score >= 90 && score <= 100) {
//        System.out.println("You score -> A");
//        } else if (score >= 80 && score <= 89) {
//        System.out.println("You score -> B");
//        } else if (score >= 70 && score <= 79) {
//        System.out.println("You score -> C");
//        } else if (score >= 60 && score <= 69) {
//        System.out.println("You score -> D");
//        } else {
//                System.out.println("You score -> F");
//        }