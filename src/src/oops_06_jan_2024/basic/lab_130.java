package oops_06_Jan_2024;

public class lab_130 {
    public static void main(String[] args) {

        String name = "Pramod"; // String constant Pool
        String name2 = new String("Pramod"); // Heap area

        name = "Dutta";

        String str1 = "Hello";
        str1  = str1.concat("Pramod");
        System.out.println(str1);


    }
}
