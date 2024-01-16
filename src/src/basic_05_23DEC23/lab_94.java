package src.basic_05_23DEC23;

import java.util.Scanner;

public class lab_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        long fact =1;

        for (int i = 1; i <=num; i++) {
            fact = fact*i;
        }
        System.out.println("fact " + fact);

//        int i=1;
//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Fact -> "+ fact);
    }
}
