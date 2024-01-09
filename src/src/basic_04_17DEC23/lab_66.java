package src.basic_04_17DEC23;

import java.util.Scanner;

public class lab_66 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value1");
        int a= sc.nextInt();
        System.out.println("enter the value2");
        int b= sc.nextInt();
        System.out.println("enter the value3");
        int c= sc.nextInt();



        double x = Math.pow(a,2);
        double y = Math.pow(b,2);
        double z = Math.abs(c);


        System.out.println(Math.cbrt(x+y-z));





    }


}
