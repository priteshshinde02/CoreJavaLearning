package src.basic_05_23DEC23;

import java.util.Scanner;

public class lab_95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        long fact =0;

        for (int i = 1; i <=num ; i++) {
            fact = fact + i;
        }
        System.out.println("value "+fact);
    }
}
