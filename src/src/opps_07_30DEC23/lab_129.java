package src.opps_07_30DEC23;

public class lab_129 {
    public static void main(String[] args) {
        String name = "pritesh";

        String y = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);

    }
}
