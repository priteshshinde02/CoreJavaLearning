package src.oops_13th_jan_2024.accessModifers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrcop = new Cop(2);
        System.out.println(jrcop.gun);
        jrcop.canIShoot();
    }
}
