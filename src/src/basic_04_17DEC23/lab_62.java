package src.basic_04_17DEC23;

public class lab_62 {
    public static void main(String[] args) {
        int itemCode = 002;
        switch (itemCode) {
            case 001, 002, 003:
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
            default:
                System.out.println("It's a software product!");

        }
    }
}
