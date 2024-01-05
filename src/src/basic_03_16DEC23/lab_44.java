package dec_16_23;

public class lab_44 {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(--b + b++ + ++b);
        System.out.println(b);
        // A -> --b , Exp ->9 , b ->9
        // B -> b++ , Exp 9 , b ->  10
        // C , Exp -> 11 , b - 11

    }

}
