import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Puszek", 2);
        Cat cat2 = new Cat("Pusia", 4);
        Cat cat3 = new Cat("Szczesciarz", 7);
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();
    }
}
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public void printCatInfo(){
        System.out.println(name + " ma " + age + " lata.");
    }
}
