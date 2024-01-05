package dec_16_23;

import java.util.Scanner;

public class lab_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();

        if (a%2 ==1) {
            System.out.println("odd number");
        }else {
            System.out.println("even number");
        }


    }
}
