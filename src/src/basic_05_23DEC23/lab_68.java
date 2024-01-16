package src.basic_05_23DEC23;

import java.util.Scanner;

public class lab_68 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value x ");
        double x = sc.nextDouble();
        System.out.println("Enter the value y ");
        double y = sc.nextDouble();
        System.out.println("Enter the value z ");
        double z = sc.nextDouble();

        double result;

        result  = Math.cbrt(Math.pow(x,2) + Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();




    }
}
