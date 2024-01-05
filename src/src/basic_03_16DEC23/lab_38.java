package dec_16_23;

public class lab_38 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 12;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

    }
}
