package src.basic_05_23DEC23;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class lab_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("enter your age");
        int age= sc.nextInt();

        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);



        sc.close();














    }
}
