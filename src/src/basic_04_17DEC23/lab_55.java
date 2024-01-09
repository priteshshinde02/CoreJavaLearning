package src.basic_04_17DEC23;

import java.util.Scanner;

public class lab_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int side1 = sc.nextInt();
        System.out.println("ENter the value 2");
        int side2 = sc.nextInt();
        System.out.println("enter the value 3");
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side1 == side3)) {
            System.out.println("EQ.");
        } else if ((side1 == side2) || (side1 == side3) || (side2 == side3)) {
            System.out.println("ISO");
        } else {
            System.out.println("Scalene");
        }
    }
}