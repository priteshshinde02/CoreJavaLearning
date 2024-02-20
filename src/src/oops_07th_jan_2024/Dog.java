package src.oops_07th_jan_2024;

public class Dog {
    String name; // Instance Variable

    Dog(){
        System.out.println("DC");
    }

    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("PC");
    }

    void bark(){
        int age = 10; // Local Variable
        System.out.println("Bark");
        System.out.println("Dog name is -> "+ this.name);
    }
}
