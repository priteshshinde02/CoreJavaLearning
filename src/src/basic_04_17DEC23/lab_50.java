package src.basic_04_17DEC23;

import java.util.Scanner;

public class lab_50 {
    public static void main(String[] args) {
//        if(true) {
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//        if(true){
//            System.out.println("Only If");
//            }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 20) {
            System.out.println("number is > 20");
        } else if (num > 10) {
            System.out.println("number is > 10");
        }else {
            System.out.println("number is <20");
        }
        }
    }



