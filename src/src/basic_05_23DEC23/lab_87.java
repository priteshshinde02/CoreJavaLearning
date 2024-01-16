package src.basic_05_23DEC23;

public class lab_87 {
    public static void main(String[] args) {
        for ( int i = 1 ; i <10 ; i++){
            if(i%2==0) {
                System.out.println("value is even" + i);
                continue;
            }
                System.out.println("value is odd"+i);
        }
    }
}
