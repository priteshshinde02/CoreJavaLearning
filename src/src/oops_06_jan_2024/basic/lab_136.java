package src.oops_06_jan_2024.basic;

public class lab_136 {
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
