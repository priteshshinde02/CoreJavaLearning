package src.opps_07_30DEC23;

public class lab_117 {
    public static void main(String[] args) {
        System.out.println("Run fine!!");

        int d = main(10);
        System.out.println(d);
        main("Pramod");

    }

    static void main(String a){
        System.out.println("I am a company.Main function but JVM doesn't recognize me");
    }

    static int main(int a){
        return a+101;

    }
}
