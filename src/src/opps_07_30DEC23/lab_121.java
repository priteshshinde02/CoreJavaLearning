package src.opps_07_30DEC23;

import java.util.Scanner;

public class lab_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the a");
        int a = sc.nextInt();
        System.out.println("enter the b");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println(+a);
        System.out.println(+b);
    }
}
