package src.basic_04_17DEC23;

public class lab_63 {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");  //-> if you use this arrow you can't use break
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");


        }
    }

}
