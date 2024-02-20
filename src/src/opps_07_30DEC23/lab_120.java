package dec_30_23;

public class lab_120 {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(--b + b++ + b--);
        // A  Exp -> 9, b -> 9
        // B Exp -> 9, b -> 9
        // C Exp -> 10->  b -> 9
    }
}
