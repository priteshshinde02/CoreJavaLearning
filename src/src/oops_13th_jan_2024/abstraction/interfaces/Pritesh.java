package src.oops_13th_jan_2024.abstraction.interfaces;

public class Pritesh implements Father{
    @Override
    public void load1K() {
        Father.print2();
        System.out.println("I will give you LOAN!");
    }
}
