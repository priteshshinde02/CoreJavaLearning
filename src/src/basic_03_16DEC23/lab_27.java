package dec_16_23;

public class lab_27 {
    public static void main(String[] args) {
        byte b = 10;
//        int a =  b; // Implicit Casting - JVM
        int a = (int) b; // Explicit Casting - JVM


        // Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        // byte b1 = a1; // Invalid - Implicit Casting
        byte b1 = (byte)a1; // EXPLICIT castig
        System.out.println(b1);
    }
}
