package src.basic_04_17DEC23;

import java.util.Scanner;

public class lab_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vowel");

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);

        switch (user_input){

            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");




        }

    }
}
